package com.javalearning.compare;

public class Car implements Comparable<Car>{
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    String name;
    Double price;

    public Car(String name, Double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }


}
