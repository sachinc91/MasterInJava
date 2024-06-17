package com.javalearning.recursion;

public class NestedObject {

    public static void updateMissingAttribute(String str,String str1){

        System.out.println(str + " " + str1);
        for(int i=0;i < 10 ; i++){
            updateMissingAttribute(str,str);
        }

    }

    public static void main(String[] args) {
        updateMissingAttribute("hi","hello");
    }
}
