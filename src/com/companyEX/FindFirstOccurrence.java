package com.companyEX;

class FindOccurrence {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (haystack.length()<len)
            return -1;
        for (int i = 0; i < haystack.length()-len+1; i++) {
            if(haystack.substring(i,i+len).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}


public class FindFirstOccurrence {
    public static void main(String[] args){
        FindOccurrence  s1 = new FindOccurrence();
        int re= s1.strStr("a","a");
        System.out.println(re);
    }
}