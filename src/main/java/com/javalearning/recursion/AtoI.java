package com.javalearning.recursion;

public class AtoI {
    static int myAtoiRecursive(String str, int n) {

        // Base case (Only one digit)
        if (n == 1) {
            return str.charAt(0) - '0';
        }

        // If more than 1 digits, recur for (n-1),
        // multiplu result with 10 and add last digit
        return 10 * myAtoiRecursive(str, n - 1) + (str.charAt(n - 1) - '0');
    }

    static int myAtoi(String str, int n) {

        // Base case (Only one digit)
        int num = str.charAt(0) - '0';

        if (n == 1) return num;

        for (int i = 1; i < n; i++) {
            num = 10 * num + str.charAt(i) - '0';
        }
        return num;
    }

    // Driver code
    public static void main(String[] s) {
        String str = "112";
        int n = str.length();

        System.out.println(myAtoi(str, n));
    }
}
