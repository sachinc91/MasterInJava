package com.javalearning;

import java.util.List;

public class CustomMath implements Cloneable {

    List<String> numbers;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int add(int a, int b){
        return a+b;
    }
}
