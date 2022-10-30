package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getAll() {
        return carDAO.getAll();
    }

    @Override
    public List<Car> getByCount(int count) {
        return carDAO.getByCount(count);
    }
}
