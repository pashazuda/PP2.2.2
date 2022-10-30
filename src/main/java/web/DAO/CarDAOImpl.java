package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1, "Lada", "Blue"));
        cars.add(new Car(2, "Kia", "Green"));
        cars.add(new Car(3, "Opel", "White"));
        cars.add(new Car(4, "Ford", "Red"));
        cars.add(new Car(5, "Porsche", "Black"));
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public List<Car> getByCount(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
