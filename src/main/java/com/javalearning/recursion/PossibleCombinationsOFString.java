package com.javalearning.recursion;

public class PossibleCombinationsOFString {

    public static void main(String[] args) {
        char[] set = {'a' , 'b','c','d','e'};
        printCombination(set,"",2,3);
    }

    static void printCombination(char[] set,String prefix,int k, int n){

        if(k==0){
            System.out.println(prefix);
            return;
        }

        for(int i=0; i<n ; i++){
            String newPrefix = prefix + set[i];
            printCombination(set,newPrefix,k-1,n);
        }
    }
}
