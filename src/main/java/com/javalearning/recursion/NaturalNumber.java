package com.javalearning.recursion;

public class NaturalNumber {

    static void natural(int i,int n){
        if(i>n) return;

        System.out.println(i);
        natural(i+1,n);
    }

    public static void main(String[] args) {
        natural(1,50);
    }
}
