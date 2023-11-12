package com.javalearning.other;

public class StaticRef {

    public static void saysomething(){
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        Signable signable = StaticRef::saysomething;
        signable.art();
    }
}
