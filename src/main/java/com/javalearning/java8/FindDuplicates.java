package com.javalearning.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// find duplicate elements in a given integers list in java using Stream functions
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,1,2,3,4,5);

        Set<Integer> set = new HashSet<>();
        List<Integer> newList =  myList.stream().distinct().collect(Collectors.toList());

        newList.stream().forEach(System.out::print);

    }
}
