package com.javalearning.iv;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {

        String str = "sachin";

        char []ch = str.toCharArray();

        for(int i=ch.length-1; i >= 0; i--){
            System.out.print(ch[i]);
        }
    }
}
