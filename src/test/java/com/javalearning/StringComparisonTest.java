package com.javalearning;

import org.junit.Test;

public class StringComparisonTest {

    @Test
    public void compareNullStringWithData(){

        String abc= null;
        String xyz = "dell";

        boolean result =xyz.equals(abc);
        System.out.println(result);
    }
}
