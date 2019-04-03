package com.example.modernjava.behaviorParameterization;

import com.example.modernjava.domain.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static com.example.modernjava.domain.CarColors.*;


public class CarServiceTest {

    private CarService carService;
    private List<Car> cars;

    @Before
    public void before() {
        carService = new CarService();
        cars = Arrays.asList(new Car(1970, BLACK), new Car(1990, WHITE), new Car(2001, RED), new Car(getCurrentYear(), WHITE));
    }

    @Test
    public void colorFilterCarsTest() {
        List<Car> whiteCars = carService.filterCars(this.cars, car -> WHITE.equals(car.getColor()));

        Assert.assertEquals(2, whiteCars.size());
        Assert.assertEquals(WHITE, whiteCars.get(0).getColor());
        Assert.assertEquals(WHITE, whiteCars.get(1).getColor());
    }

    @Test
    public void yearFilterCarsTest() {
        List<Car> whiteCars = carService.filterCars(this.cars, car -> car.getYear() < getCurrentYear());
        Assert.assertEquals(3, whiteCars.size());
    }

    private static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}