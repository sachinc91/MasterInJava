package com.javalearning.arrays;

import java.util.Stack;

//4 - 5
//        5 - 25
//        2 - 25
//        25 - -1
public class PrintMaxElement {

    public static void main(String[] args) {

        int[] arr = new int[] {4,2, 5, 25};

//        for(int i=0; i< arr.length; i++){
//            int max = -1;
//            for(int j= i+1; j<arr.length; j++){
//                if(arr[j] > arr[i]){
//                    max = arr[j];
//                    break;
//                }
//            }
//            System.out.println("" + arr[i] + " - " + max);
//        }

        Stack<Integer> stack = new Stack<>();

        int i= arr.length -1;
        while (i > 0){
            Integer tmp;
            if(stack.isEmpty()){
                tmp = arr[i];
            }else {
                tmp = stack.peek();
            }

            if(arr[i] < tmp){
                stack.push(arr[i]);
            }else{
                stack.push(tmp);
                stack.push(arr[i]);
            }
            i--;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }



    }
}
