package com.javalearning.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;

public class FindMissingNumber {

    public static void main(String[] args) {
        int missingNum[] = {1,2,3,4,6,7,8};

        int n = Arrays.stream(missingNum).max().getAsInt();
        int sumOf = Arrays.stream(missingNum).sum();
        int maxInt = n * (n + 1) / 2;

        System.out.println("Missing no :: " + (maxInt - sumOf));
    }
}
