package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getAll();

    public List<Car> getByCount(int count);
}
