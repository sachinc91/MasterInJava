package com.javalearning.designpattern;

public class Singleton {

    private static Singleton instance = null;

    public Object getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
