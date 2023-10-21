package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", 2399, 2019));
        cars.add(new Car("Ford", 678, 1998));
        cars.add(new Car("Ferrari", 132, 2023));
        cars.add(new Car("Mini Cooper", 3672, 2016));
        cars.add(new Car("Infinity", 145, 2022));
    }
    @Override
    public List<Car> getAllCars(int count) {
        if (count<1 || count>=5){
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
