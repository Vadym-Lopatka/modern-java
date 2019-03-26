package com.example.modernjava.lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Lambda {

    public static void main(String[] args) throws Exception {

        // Consumer
        consumerExample(new Thread(() -> System.out.println("hello")));

        // Supplier
        Future<String> s = supplierExample(() -> Thread.currentThread().getName());
        System.out.println(s.get());

        // Function
        ToIntFunction<Integer> toIntFunction = (Integer x) -> x * x;
        System.out.println(toIntFunction.applyAsInt(3));
    }

    public static void consumerExample(Runnable runnable) {
        runnable.run();
    }

    public static Future<String> supplierExample(Callable<String> callable) throws Exception {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        return forkJoinPool.submit(() -> Thread.currentThread().getName());
    }
}
