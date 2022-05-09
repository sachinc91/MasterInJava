package com.javalearning.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int d=3;
        for(int i=0; i< d; i++){

            int j = arr.size()-1;
            int tmp = arr.get(j);

            for(; j>0; j--){
                arr.set(j, arr.get(j-1));
            }

            arr.set(0, tmp);
        }

        arr.stream().forEach(System.out::println);

    }
}
