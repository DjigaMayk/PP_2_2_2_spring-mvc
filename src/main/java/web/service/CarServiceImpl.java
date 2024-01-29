package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;


    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 455, "Black"));
        cars.add(new Car("Mercedes", 222, "Blue"));
        cars.add(new Car("Ford", 320, "Red"));
        cars.add(new Car("Lada", 2114, "Yellow"));
        cars.add(new Car("Ferrari", 420, "Brown"));

    }

    @Override
    public List<Car> show(int counter) {
        if (counter >= 5) {
            return new ArrayList<>(cars);
        } else {
            return cars.stream().limit(counter).collect(Collectors.toList());
        }
    }
}


