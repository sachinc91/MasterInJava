package com.javalearning.generics;

import java.util.Arrays;

public class GenericList<E>{

    Object[] list = new Object[10];
    int i = 0;

    public void add(E e){
        if(i<10){
            list[i++] = e;
        }
    }

    public void display(){
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        list.display();
    }
}
