package com.companyEX;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class GetValidAnagram {
    public boolean isAnagram(String s, String t) {
        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();

        for (char c: s.toCharArray()) {
            listS.add(c);
        }

        for (char n: t.toCharArray()) {
            listT.add(n);
        }

        List<Character> newListS=listS.stream().sorted().collect(Collectors.toList());
        List<Character> newListT=listT.stream().sorted().collect(Collectors.toList());

        boolean areEqual = newListS.equals(newListT);

        if (areEqual){
            return true;
        }else{
            return false;
        }
    }
}


public class ValidAnagram {
    public static void main(String[] args){
        GetValidAnagram s1 = new GetValidAnagram();
        boolean re =s1.isAnagram("anagram","nagaram");
        System.out.println(re);
    }
}