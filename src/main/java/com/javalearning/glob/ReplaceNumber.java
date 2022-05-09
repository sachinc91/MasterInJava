package com.javalearning.glob;

import java.util.Stack;

public class ReplaceNumber {

    public static void main(String[] args) {
        int number = 12001;
        int tmpnum = number;

        Stack<Integer> stack = new Stack();
        while(tmpnum > 0){
            int k = tmpnum % 10;
            if(k == 0){
                k = 9;
            }

            stack.push(k);
            tmpnum = tmpnum / 10;
        }

        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
