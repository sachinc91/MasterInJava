package com.javalearning.immutable;

public class CarBuilder {

    Car c2;

    public void changeObject(Car c){
        this.c2 = c;
        c2.setModel("baleno");
        c2.setRegistrationNo("mh14du1351");
    }
}
