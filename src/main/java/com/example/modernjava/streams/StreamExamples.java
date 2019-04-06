package com.example.modernjava.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    List<Integer> getUniqueEvenNumbersList(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }

    List<Integer> getOrderedUniqueEvenNumbersList(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    List<Integer> getFirstNElementsFromList(int firstNToGet, List<Integer> integers) {
        return integers.stream()
                .limit(firstNToGet)
                .collect(Collectors.toList());
    }

    List<Integer> skipFirsNElementsFromList(int firstNToSkip, List<Integer> integers) {
        return integers.stream()
                .skip(firstNToSkip)
                .collect(Collectors.toList());
    }
}
