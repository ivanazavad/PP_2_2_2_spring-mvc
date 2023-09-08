package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiceInterface {

    List<Car> carsCount(List<Car> list, int number);//todo интерфейсы стоит переименовать (оба.. ) класс называем - CarServiceImpl, интерфейс - CarService
}
