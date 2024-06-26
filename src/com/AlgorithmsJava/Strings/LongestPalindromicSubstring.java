package com.AlgorithmsJava.Strings;

import java.util.jar.JarOutputStream;

public class LongestPalindromicSubstring {
 public String Palindrome (String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for (int i=0; i < s.length(); i++ ) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - ((len -1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }


    public int expandFromMiddle(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right--;
        }

        return right - left - 1;
    }

    static public boolean isPalindrome(String str) {
     StringBuilder s = new StringBuilder();

     for(int i = str.length()-1; i >= 0; i--) {
         s.append(str.charAt(i));
     }
     return str.equals(s.toString()) ? true: false;
}
    public void longestPalindrome(String s) {

    }


}
