package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @GetMapping("/cars")
    public String index(Model model, @RequestParam(value = "count", defaultValue = "5") int someCars) {
        List<Car> list = carService.carsCount(someCars);
        model.addAttribute("cars", list);
        return "cars";
    }
}
