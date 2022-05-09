package com.javalearning.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,5,4);

        Set<Integer> set = list.stream().distinct().collect(Collectors.toSet());
        set.stream().forEach(System.out::println);
    }
}
