package com.javalearning.thread;

import java.util.Stack;

public class RandomNumber {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        Thread t = new Thread(new RNumber(s));
        t.start();
        System.out.println(s.toString());
    }
}
