package com.javalearning.string;

public class CountOccurance {

    public static void main(String[] args) {
        String str = "aabbbbccdddd";

        char ch[] = str.toCharArray();

        for(int i=0; i< str.length() -1; i++){

            for(int j=i+1; j< str.length(); j++){
                if(ch[i] != ch[j]){
                    
                }
            }
        }
    }
}
