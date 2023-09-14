package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
@RequestMapping()
public class CarController {

    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }


    //todo: контроллер в методе - должен обращаться только к сервису, уже в сервисе - идет обращение к repository-слою, в нашем случае которым является dao

    @GetMapping("/cars")
    public String index(Model model, @RequestParam(value = "count", defaultValue = "5") int someCars) {
        CarDao carDao = new CarDaoImpl();
        List<Car> list = carService.carsCount(carDao.index(), someCars);
        model.addAttribute("cars", list);
        return "cars";
    }
}
