package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    public List<Car> carsCount(List<Car> list, Integer number) {//todo: отказываемся от int, испоьзуем Integer
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
