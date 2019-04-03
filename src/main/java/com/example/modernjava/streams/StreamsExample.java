package com.example.modernjava.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 4, 3, 5, 5, 4, 6);

        /*
            1. filter all even integers from a list
            2. remove duplicates
            3. println() elements that stayed
        */
        integers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
