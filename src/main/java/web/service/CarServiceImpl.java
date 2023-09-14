package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao = new CarDaoImpl();

    public List<Car> carsCount(Integer number) {
        List<Car> count = carDao.index();
        if (number == 0 || number > 5) return count;
        return count.stream().limit(number).collect(Collectors.toList());
    }

    public Car carShow(Integer id) {
        return carDao.show(id);
    }
}
