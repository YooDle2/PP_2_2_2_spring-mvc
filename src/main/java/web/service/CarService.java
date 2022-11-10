package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 1));
        cars.add(new Car("Porsche", "Taycan", 2));
        cars.add(new Car("Mitsubishi", "Lancer", 3));
        cars.add(new Car("Lada", "Granta", 4));
        cars.add(new Car("Lexus", "RX", 5));
    }

    public List<Car> getCars() {
        return cars;
    }
    public List<Car> getCountCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
