package com.javalearning.glob;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ReverseChars {

    public static void main(String[] args) {

        String s="Ab,c,de!$";

        Stack<Character> stack =  new Stack<>();
        ArrayList<Character> array = new ArrayList<>();

        char chars[] = s.toCharArray();

        for(char c : chars){

            if(((int)c) >=65 && ((int)c)<=117){
                stack.push(c);
            }else {
                array.add(c);
            }
        }

        while(!stack.empty()){
            System.out.print(stack.pop());
        }
        array.stream().forEach(System.out::print);
    }
}

