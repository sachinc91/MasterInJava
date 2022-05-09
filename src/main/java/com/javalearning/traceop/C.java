package com.javalearning.traceop;

public class C extends B{
    public void c(){
    }

    public static void main(String[] args) {
        A a= new C();
        System.out.println(a instanceof A);
        System.out.println(a instanceof C);
    }

}

