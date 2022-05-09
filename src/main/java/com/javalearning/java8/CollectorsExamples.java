package com.javalearning.java8;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExamples {

    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1,"sachin"));
//        employees.add(new Employee(2,"sagar"));
//        employees.add(new Employee(3,"ted"));

        //Exmplae 1
        givenList.stream().collect(Collectors.toList());

        //convert list to linkedlist
        givenList.stream().collect(Collectors.toCollection(LinkedList::new));

         //Map<Integer,Employee> map= employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (o1, o2) -> o1));

         //map.entrySet().forEach(System.out::println);


    }
}
