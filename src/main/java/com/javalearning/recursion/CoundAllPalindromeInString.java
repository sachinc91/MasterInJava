package com.javalearning.recursion;

public class CoundAllPalindromeInString
{
    public int countSubstrings(String S) {
        int N = S.length(), ans = 0;
        for (int center = 0; center <= 2*N-1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                System.out.println(S.substring(left,right+1));
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CoundAllPalindromeInString cp = new CoundAllPalindromeInString();
        System.out.println(cp.countSubstrings("nitin"));
    }
}
