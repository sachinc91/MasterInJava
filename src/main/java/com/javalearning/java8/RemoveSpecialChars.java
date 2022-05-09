package com.javalearning.java8;

import java.util.Arrays;

public class RemoveSpecialChars {

    public static void main(String[] args) {

        String str = "#$This is$%5 Krishna12";
        StringBuilder str2 = new StringBuilder();
        for(char c : str.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                str2.append(c);
            }
        }
        System.out.println(str2);
    }
}
