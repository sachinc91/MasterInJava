package com.javalearning.thread;

import java.util.Random;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class RNumber implements Runnable {
    Stack<Integer> stack;
    public RNumber(Stack<Integer> s){
        this.stack = s;
    }
    @Override
    public void run() {
        AtomicInteger i = new AtomicInteger();

        while (i.getAndIncrement() < 10){
            System.out.println(i.getAndIncrement());
            this.stack.push(new Random().nextInt());
        }
    }
}
