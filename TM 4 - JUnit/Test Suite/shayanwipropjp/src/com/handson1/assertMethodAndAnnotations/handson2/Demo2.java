package com.handson1.assertMethodAndAnnotations.handson2;

public class Demo2 {
    public boolean palindromeCheck(String str) {
        str = str.toLowerCase();
        String strRev = "";
        int length = str.length();
        boolean isPalindrome;
        for (int i = (length - 1); i >= 0; i--) {
            strRev += str.charAt(i);
        }
        if (str.equals(strRev)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
