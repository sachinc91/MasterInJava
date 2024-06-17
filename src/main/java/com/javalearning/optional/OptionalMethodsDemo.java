package com.javalearning.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMethodsDemo {

    public List<Department> getDummyDepartments(){
        List<Department> departments = new ArrayList<>();
        departments.add(new Department("IT", "Pune", List.of(
                new Employee("John", 30),
                new Employee("Smith", 40),
                new Employee("David", 50)
        )));
        departments.add(new Department("HR", "Mumbai", List.of(
                new Employee("John", 30),
                new Employee("Smith", 40),
                new Employee("David", 50)
        )));
        return  departments;
    }


    public Optional<Department> getDepartment(String name) {
        // create department object and add dummy data
        List<Department> departments = getDummyDepartments();
        return departments.stream().filter(department -> department.name().equalsIgnoreCase(name)).findFirst();
    }

    public static void main(String[] args) {
        OptionalMethodsDemo optionalMethodsDemo = new OptionalMethodsDemo();
        optionalMethodsDemo.getDepartment("ITT").ifPresentOrElse(
                department -> System.out.println(department.name()),
                () -> System.out.println("Department not found")
        );

    }

}
