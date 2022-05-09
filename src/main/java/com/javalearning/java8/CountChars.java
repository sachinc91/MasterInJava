package com.javalearning.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountChars {

    public static void main(String[] args) {
        String str = "ABCDCBAFGH";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }

        for(Map.Entry<Character, Integer> data: map.entrySet()){
            System.out.println("Key = " + data.getKey() +  ", Value = " + data.getValue());
        }
    }
}
