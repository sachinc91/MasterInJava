package com.javalearning.glob;

import java.util.Arrays;

public class FilterData {
    public static void main(String[] args) {
        String arr[] = {"I","Me","you","He","him","her","She",null};

        Arrays.asList(arr).stream().filter( k -> ("I").equals(k) || k.equals("Me")).forEach(System.out::println);
    }
}
