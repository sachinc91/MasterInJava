package com.javalearning.arrays;

import java.util.*;

public class CountTriplet {

    public static void countTriplet() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int counter = 0;
            int n = sc.nextInt();

            Map<Integer,Integer> map = new HashMap<>();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i],i);
            }

            for (int i = 0; i < n; i++) {
                for(int j=i; j<n; j++){
                        if (i!=j && map.containsKey(arr[i] + arr[j])) {
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                System.out.println(counter);
            } else {
                System.out.println(-1);
            }
        }

    }

    public static void main(String[] args) {
        countTriplet();
    }
}
