package com.example.modernjava.optional;

import java.util.Optional;

public class OptionalExample {

    public static Integer multiplyInteger(Integer integer) {
        return Optional.ofNullable(integer)
                .map(i -> i * i)
                .orElse(0);
    }

    public static Optional<Double> powIfEvenNumber(Integer integer) {
        Double value = Optional.ofNullable(integer)
                .filter(i -> i % 2 == 0)
                .map(i -> Math.pow(i, i))
                .orElse(null);

        return Optional.ofNullable(value);
    }
}
