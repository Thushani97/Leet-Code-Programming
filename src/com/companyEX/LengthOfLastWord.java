package com.companyEX;

class LengthOfWord {
    public int lengthOfLastWord(String s) {
       String[] arr= s.trim().split("\\s");
       return  ((arr[arr.length-1]).length());
    }
}
public class LengthOfLastWord {
    public static void main(String[] args){
        LengthOfWord  s1 = new LengthOfWord();
        int re= s1.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(re);
    }
}