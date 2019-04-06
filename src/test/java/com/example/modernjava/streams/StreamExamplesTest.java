package com.example.modernjava.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamExamplesTest {
    private final StreamExamples streamExamples = new StreamExamples();
    private static final List<Integer> integers = Arrays.asList(3, 4, 3, 5, 5, 4, 6, 2);

    @Test
    public void getUniqueEvenNumbersListTest() {
        assertEquals(Arrays.asList(4, 6, 2), streamExamples.getUniqueEvenNumbersList(integers));
    }

    @Test
    public void getOrderedUniqueEvenNumbersListTest() {
        assertEquals(Arrays.asList(2, 4, 6), streamExamples.getOrderedUniqueEvenNumbersList(integers));
    }

    @Test
    public void getFirstNElementsFromListTest() {
        assertEquals(Arrays.asList(3, 4, 3), streamExamples.getFirstNElementsFromList(3, integers));
    }

    @Test
    public void skipFirsNElementsFromListTest() {
        assertEquals(Arrays.asList(4, 6, 2), streamExamples.skipFirsNElementsFromList(5, integers));
    }
}