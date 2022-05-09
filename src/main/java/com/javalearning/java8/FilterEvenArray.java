package com.javalearning.java8;

import java.util.Arrays;
import java.util.List;

public class FilterEvenArray {

    public static void main(String[] args) {
        Integer[] numbers= {1,2,3,4,5,6};

        Arrays.asList(numbers).stream().filter( k -> k % 2 == 0).forEach(e -> System.out.print(e + " "));
    }
}
