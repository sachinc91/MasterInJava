/*
package com.javalearning.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarBuilder {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Naxon", Double.valueOf(500000)));
        cars.add(new Car("Baleno", Double.valueOf(100000)));
        cars.add(new Car("Xuv 500", Double.valueOf(200000)));

//        Collections.sort(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.price > o2.price) {
                    return 1;
                }
            }
        });
        cars.stream().forEach(car -> System.out.println(car));
    }
}
*/
