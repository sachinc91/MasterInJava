package com.javalearning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintSumOfOdd {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,5,4);
        //list.stream().filter(n -> n % 2 !=0).forEach(System.out::println);
        Integer i = list.stream().filter(n -> n % 2 !=0).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(i);
    }
}
