package com.javalearning.string;

public class ReverseStringWithoutSpecialChars {

    public static void main(String[] args) {
        String s="Ab,c,de!$";


        int l=0;
        int r= s.length() -1;
        char arr[] = s.toCharArray();
        while(l<r){

            if(!Character.isAlphabetic(s.charAt(l))){
                l++;
            }else if(!Character.isAlphabetic(s.charAt(r))){
                r--;
            }else {
                char tmp = arr[r];
                arr[r] = arr[l];
                arr[l] = tmp;
                l++;
                r--;
            }
        }

        System.out.println(arr);
    }
}
