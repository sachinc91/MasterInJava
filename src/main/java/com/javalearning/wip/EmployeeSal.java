package com.javalearning.wip;

import com.javalearning.java8.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSal {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,40,50000);
        Employee e2= new Employee(2,50,50000);
        Employee e3 = new Employee(3,45,50000);
        Employee e4 = new Employee(4,10,50000);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        list.stream().filter(e -> (e.age >=40 && e.age <=50)).limit(10).forEach(System.out::println);
    }
}
