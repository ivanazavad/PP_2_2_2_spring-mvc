package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDaoInterface {
    List<Car> index();
    Car show(int id);
}
