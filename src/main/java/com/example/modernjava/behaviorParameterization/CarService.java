package com.example.modernjava.behaviorParameterization;

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
    public static class Car {
        private int year;
        private CarColors color;

        public Car() {
        }

        public Car(int year, CarColors color) {
            this.year = year;
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public CarColors getColor() {
            return color;
        }

        public void setColor(CarColors color) {
            this.color = color;
        }
    }

    public enum CarColors {
        WHITE,
        BLACK,
        RED
    }

}
