package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService implements CarServiceInterface {

    public List<Car> carsCount(List<Car> list, int number) {//todo: отказываемся от int, испоьзуем Integer
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
