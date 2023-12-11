package com.companyEX;

import java.util.Arrays;
import java.util.List;

class Solution2{
    public int removeElement(int[] nums, int val) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[count] = nums[i];
                List<Integer> resultList = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new));

                System.out.println(resultList);
                count++;
            }
        }
        return count;
    }
}

public class RemoveElement {
    public static void main(String[] args){
        Solution2 s1 = new Solution2();
        int re= s1.removeElement(new int[]{0,1,2,2,3,0,4,2},2);
        System.out.println(re);
    }
}
