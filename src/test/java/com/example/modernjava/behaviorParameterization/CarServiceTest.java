package com.example.modernjava.behaviorParameterization;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static com.example.modernjava.behaviorParameterization.CarService.CarColors.*;

public class CarServiceTest {

    private CarService carService;
    private List<CarService.Car> cars;

    @Before
    public void before() {
        carService = new CarService();
        cars = Arrays.asList(new CarService.Car(1970, BLACK), new CarService.Car(1990, WHITE), new CarService.Car(2001, RED), new CarService.Car(getCurrentYear(), WHITE));
    }

    @Test
    public void colorFilterCarsTest() {
        List<CarService.Car> whiteCars = carService.filterCars(this.cars, car -> WHITE.equals(car.getColor()));

        Assert.assertEquals(2, whiteCars.size());
        Assert.assertEquals(WHITE, whiteCars.get(0).getColor());
        Assert.assertEquals(WHITE, whiteCars.get(1).getColor());
    }

    @Test
    public void yearFilterCarsTest() {
        List<CarService.Car> whiteCars = carService.filterCars(this.cars, car -> car.getYear() < getCurrentYear());

        Assert.assertEquals(3, whiteCars.size());
    }

    private static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}