package com.example.modernjava.behaviorParameterization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> filterCars(List<Car> cars, Predicate<Car> predicate) {
        return cars.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    /**
     * simple Java Bean
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Car {
        private int year;
        private CarColors color;
    }

    public enum CarColors {
        WHITE,
        BLACK,
        RED
    }

}
