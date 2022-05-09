package com.javalearning.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinNumber {

    public static void main(String[] args) {
        int numbers[] = {1,2,7,5,6,7};
        IntStream.of(numbers).min().ifPresent(min -> System.out.println(min));
        IntStream.of(numbers).max().ifPresent(max -> System.out.println(max));
        IntStream.of(numbers).average().ifPresent(average -> System.out.println(average));
        System.out.println(IntStream.of(numbers).count());

        IntStream.of(numbers).distinct().sorted().limit(3).boxed().collect(Collectors.toList());
    }
}
