package com.javalearning.sorting;

import java.util.Arrays;

/** Selection sort pick minimum element from array and swap with beginning element of unsorted sub array .
 *  Refer : https://www.youtube.com/watch?v=9oWd4VJOwr0&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF
 * **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = { 1 , 3 , 4 , 2 , 5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] arrays){

        for(int i=0; i< arrays.length; i++){

            int min = i;

            for (int j= i + 1; j< arrays.length; j++){
                if(arrays[j] < arrays[min]){
                    min = j;
                }
            }
            if(min != i){
                int tmp = arrays[min];
                arrays[min] = arrays[i];
                arrays[i] = tmp;
            }
        }
    }
}
