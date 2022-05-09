package com.javalearning.arrays;

import java.util.Arrays;

public class PrintSplitArray {

    public static void main(String[] args) {
        int t[] = {1,2,3,-4,5,6,7,8};
        int splitSize = t.length / 4;
        int r=splitSize;
        int maxDiff = 0;
        for(int i=0; i< 4; i++){
            int[] arr =getSubArray(t,i * splitSize,r);

            int min = Arrays.stream(arr).min().getAsInt();
            int max = Arrays.stream(arr).max().getAsInt();
            int diff = max-min;

            if(maxDiff < diff){
                maxDiff = diff;
            }
            r = r+ splitSize;

        }
        System.out.println(maxDiff);
    }

    public static int[] getSubArray(int[] t,int l,int r){
        return Arrays.copyOfRange(t,l,r);
    }
}
