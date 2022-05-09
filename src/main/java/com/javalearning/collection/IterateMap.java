package com.javalearning.collection;

import java.util.*;

public class IterateMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","Jan");
        map.put("2","Feb");
        map.put("3","March");

        for(Map.Entry entry:map.entrySet()){
            System.out.println("Key " + entry.getKey() + "value" + entry.getValue() );
        }

        for(String key : map.keySet()){
            System.out.println("Key " + key);
        }
    }
}
