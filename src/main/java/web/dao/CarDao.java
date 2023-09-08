package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao implements CarDaoInterface{

    private List<Car> cars;//todo: заметно? что IDE подсвечивает.. если навести, что подсказывает IDE?

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 5));
        cars.add(new Car(2, "Ford", 7));
        cars.add(new Car(3, "Audi", 10));
        cars.add(new Car(4, "Lexus", 300));
        cars.add(new Car(5, "Toyota", 50));
    }

    public List<Car> index() {
        return cars;
    }

    public Car show(int id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }
}
