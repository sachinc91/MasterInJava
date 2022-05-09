package com.javalearning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintAbcSequenceMain {

    public static void main(String[] args) {

//        PrintAbcSequenceRunnable pr = new PrintAbcSequenceRunnable(1);
//        PrintAbcSequenceRunnable pr1 = new PrintAbcSequenceRunnable(2);
//        PrintAbcSequenceRunnable pr2 = new PrintAbcSequenceRunnable(0);
//
//        Thread t1 = new Thread(pr, "A");
//        Thread t2 = new Thread(pr1,"B");
//        Thread t3 = new Thread(pr2,"C");

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new PrintAbcSequenceRunnable(1));
        executorService.submit(new PrintAbcSequenceRunnable(2));
        executorService.submit(new PrintAbcSequenceRunnable(0));

        executorService.shutdown();
    }
}
