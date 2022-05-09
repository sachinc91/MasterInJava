package com.javalearning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumberSequence {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        int number= 1;
        int threshould = 100;
    }
}
