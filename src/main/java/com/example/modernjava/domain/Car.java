package com.example.modernjava.domain;

/**
 * simple Java Bean
 */
public class Car {
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