package com.companyEX;

class IsPalindrome {
    public boolean isPalindrome(String s) {
        String resultString = s.replaceAll("[^a-zA-Z0-9]", "");
//        String resultString = s.replaceAll("\\W", "");
        String  convertLower= resultString.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = convertLower.length()-1; i >-1; i--) {
            sb.append(convertLower.charAt(i));
        }
        System.out.println(convertLower);
        System.out.println(sb.toString());
        if (convertLower.equals(sb.toString()))
            return true;
        else
            return false;
    }
}


public class Palindrome {
    public static void main(String[] args){
        IsPalindrome s1 = new IsPalindrome();
        boolean ans =s1.isPalindrome("ab_a");
        System.out.println(ans);

    }
}