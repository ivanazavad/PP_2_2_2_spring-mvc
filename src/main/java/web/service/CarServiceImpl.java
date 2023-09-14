package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {


    public List<Car> carsCount(Integer number) {
        CarDao carDao = new CarDaoImpl();
        List<Car> count = carDao.index();
        if (number == 0 || number > 5) return count;
        return count.stream().limit(number).collect(Collectors.toList());
    }
}
