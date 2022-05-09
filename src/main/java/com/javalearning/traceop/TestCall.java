package com.javalearning.traceop;

import java.util.ArrayList;

public class TestCall {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(null);
        ar.remove(1);
        ar.remove(null);
        System.out.println(ar);

    }
}
