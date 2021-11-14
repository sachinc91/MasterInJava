/*
package com.javalearning.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Largestsumcontiguoussubarray {

    public static void main (String[] args)
    {
                maxSubArraySum();
    }

    static int maxSubArraySum()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

            for (int i = 0; i < size; i++)
            {
                max_ending_here = max_ending_here + a[i];
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
            System.out.println(max_so_far);
        }
    }

}
*/
