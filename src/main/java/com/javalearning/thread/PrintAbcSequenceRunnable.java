package com.javalearning.thread;

import java.util.concurrent.locks.ReentrantLock;

public class PrintAbcSequenceRunnable implements Runnable {

    int reminder;
    static int number = 1;
    int limit = 100;
    static final ReentrantLock lock = new ReentrantLock();

    public PrintAbcSequenceRunnable(int reminder) {
        this.reminder = reminder;
    }

    @Override
    public void run() {
        while (number < limit) {
            synchronized (lock) {
                while (number % 3 != reminder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
