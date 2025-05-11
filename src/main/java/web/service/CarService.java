package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Corolla", 2020),
            new Car("Honda", "Civic", 2019),
            new Car("Ford", "Focus", 2021),
            new Car("BMW", "3 Series", 2023),
            new Car("Kia", "Morning", 2024)

    );

    public List<Car> getCars(int count) {
        return count >= cars.size() ? cars : cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
