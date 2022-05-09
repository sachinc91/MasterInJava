package com.javalearning.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployees {

    public static void main(String[] args) {
        Employee e1 = new Employee(101,20,50000);
        Employee e2 = new Employee(102,20,10000);
        Employee e3 = new Employee(103,20,60000);
        Employee e4 = new Employee(104,20,70000);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        List<Integer> tmpList = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).map(Employee::getId).collect(Collectors.toList());
        tmpList.stream().forEach(System.out::println);

    }
}
