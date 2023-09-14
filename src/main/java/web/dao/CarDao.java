package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    public List<Car> index();

    public Car show(Integer id);//todo: использовала на странице one_car для поиска модели по id
}
