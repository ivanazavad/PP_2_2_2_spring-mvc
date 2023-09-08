package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> index();

    Car show(int id);//todo: не используем.. а зря. В этом как раз идея поспределения кода по слоям. Указал в todo
}
