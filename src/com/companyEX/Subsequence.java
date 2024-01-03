package com.companyEX;

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex=0;
        while (sIndex<s.length() && tIndex<t.length()){
            if (s.charAt(sIndex)==t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }

        return sIndex==s.length();

    }
}

public class Subsequence {
    public static void main(String[] args){
        IsSubsequence  s1 = new IsSubsequence();
        boolean re= s1.isSubsequence("abc","gabcdc");
        System.out.println(re);
    }
}