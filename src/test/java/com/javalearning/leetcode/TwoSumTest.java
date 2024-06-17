package com.javalearning.leetcode;

import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assert result[0] == 0;
        assert result[1] == 1;
    }

}
