package com.companyEX;

import java.util.Arrays;

class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String startString =strs[0];
        String endString = strs[strs.length-1];

        for (int i = 0; i <Math.min(startString.length(),endString.length()) ; i++) {
            if (startString.charAt(i)!=endString.charAt(i)){
                return sb.toString();
            }else
                sb.append(startString.charAt(i));

        }
//        return sb.toString();
        return null;


    }
}

public class LongestCommonPrefix {
    public static void main(String[] args){
        CommonPrefix  s1 = new CommonPrefix();
        String re= s1.longestCommonPrefix(new String[] {""});
        System.out.println(re);
    }
}