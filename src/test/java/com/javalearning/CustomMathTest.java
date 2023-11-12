package com.javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomMathTest {

    // add unite test for add
    @Test
    public void testAdd() {
        CustomMath customMath = new CustomMath();
        assertEquals(5, customMath.add(2, 3));
    }

}
