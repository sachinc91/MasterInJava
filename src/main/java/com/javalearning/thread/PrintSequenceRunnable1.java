/*
package com.javalearning.thread;

public class PrintSequenceRunnable1 implements Runnable {
    ThreadSequential obj;
    int threadNumber;
    static int number = 0;
    PrintSequenceRunnable1(ThreadSequential obj, int result){
        this.obj = obj;
        this.threadNumber = result;
    }
    @Override
    public void run() {
        while (number < ThreadSequential.MAX_NUMBERS) {
            synchronized(obj) {
                // check again for (number < ThreadSequential.MAX_NUMBERS) otherwise one more number my be
                // printed by another thread
                if(number % 3 == threadNumber && number < ThreadSequential.MAX_NUMBERS){
                    System.out.println(Thread.currentThread().getName() + " - " + ++number);
                }
            }
        }
    }
}
*/
