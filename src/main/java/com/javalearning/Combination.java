package com.javalearning;

import java.util.concurrent.atomic.AtomicInteger;

class Combination {

    void combinationUtil(int start,
                                int end, int index, int r,Integer c)
    {
        if (index == r)
        {
            c = c+1;
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            combinationUtil( i+1, end, index+1, r,c);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    void printCombination(int n, int r)
    {
        // A temporary array to store all combination one by one
//        int data[]=new int[r];
        // Print all combination using temprary array 'data[]'
        Integer c = new Integer(0);
        combinationUtil(0, n-1, 0, r,c);
        System.out.println(c);
    }

    /*Driver function to check for above function*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 2;
        int n = 6;
        new Combination().printCombination(n, r);

    }
}
