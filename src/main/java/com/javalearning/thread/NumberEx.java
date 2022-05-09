package com.javalearning.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class NumberEx {

    private static AtomicInteger i = new AtomicInteger();

    public static void main(String[] args) {
        System.out.println(i.getAndIncrement());
        System.out.println(i.getAndIncrement());
        System.out.println(i.getAndIncrement());
        System.out.println(i.getAndIncrement());
    }
}
