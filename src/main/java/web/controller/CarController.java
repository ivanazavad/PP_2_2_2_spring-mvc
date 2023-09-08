package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping()
public class CarController {

    private final CarDao carDao;//todo: написал ниже...

    @Autowired
    public CarController(CarDao carDao) {//todo: написал ниже...
        this.carDao = carDao;
    }

    //todo: контроллер в методе - должен обращаться только к сервису, уже в сервисе - идет обращение к repository-слою, в нашем случае которым является dao

    @GetMapping("/cars")
    public String index(Model model, @RequestParam(value = "count", defaultValue = "5") int someCars) {
        CarService carService = new CarService();
        List<Car> list = new ArrayList<>();//todo: инициализауия не нужна (IDE подсказывает, подсвечивает серым)
        list = carService.carsCount(carDao.index(), someCars);
        model.addAttribute("cars", list);
        return "cars";
    }

}
