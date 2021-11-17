package com.javalearning.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public class CustomArrayList<E> implements RandomAccess {

    private Object[] list;

    private final int DEFAULT_CAPACITY = 10;

    private int index = 0;
    CustomArrayList(){
        list = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        if(index > list.length - 2){
            this.grow(index - 1);
        }
        list[index++] = e;
    }

    private void grow(int minCapacity){
        int oldCapacity = list.length;
        int newCapacity = oldCapacity +  (oldCapacity>>1);
        list = Arrays.copyOf(list, newCapacity);
    }

}
