package com.javalearning.immutable;

public class Main {

    public static void main(String[] args) {
        String name = "baeldung";
        String newName = name.replace("dung", "----");

        Car c = new Car("Mh14 fs 8596","ciz");
        new CarBuilder().changeObject(c);
        System.out.println(c);
    }
}
