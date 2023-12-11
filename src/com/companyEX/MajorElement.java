package com.companyEX;

import java.util.Arrays;

class MajorEle {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length/2;
        return nums[len];
    }
}


public class MajorElement {
    public static void main(String[] args){
        MajorEle  s1 = new MajorEle();
        int re= s1.majorityElement(new int[]{2,2,1,1,1,2,2});
        System.out.println(re);
    }
}