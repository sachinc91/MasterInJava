package com.javalearning.recursion;

public class SumOfNaturalNumber {

    static int natural(int n){

        if(n<2) return 1;
        return n+natural(n-1);
    }

    public static void main(String[] args) {
        System.out.println(natural(50));
    }
}
