package com.example.modernjava.behaviorParameterization;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> filterCars(List<Car> cars, CarPredicate predicate) {
        return cars.stream()
                .filter(predicate::test)
                .collect(Collectors.toList());
    }
}
