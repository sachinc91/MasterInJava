package com.javalearning.sorting;

import java.util.Arrays;

/**
 *  InsertionSort sort pick node one bye one and insert it into the right position
 * */
public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {1 , 1, 2 , 5 , 3};
        InsertionSort ins = new InsertionSort();
        ins.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            int currNode = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > numbers[i]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1] = currNode;
        }
    }
}
