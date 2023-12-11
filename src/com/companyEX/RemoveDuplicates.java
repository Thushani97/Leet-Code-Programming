package com.companyEX;

import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public int removeDuplicates(int[] nums) {
        int count=1;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(!list.contains(nums[i])){
//                list.add(nums[i]);
//                nums[count] = nums[i];
//                count ++;
//            }
//        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args){
        Solution3 s1 = new Solution3();
        int re =s1.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(re);
    }
}