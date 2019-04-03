package com.example.modernjava.behaviorParameterization;

import com.example.modernjava.domain.Car;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> filterCars(List<Car> cars, Predicate<Car> predicate) {
        return cars.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
