package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> carsCount(List<Car> list, Integer number);//todo интерфейсы стоит переименовать (оба.. ) класс называем - CarServiceImpl, интерфейс - CarService
}
