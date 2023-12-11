package com.companyEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if(m!=0){
//            for (int i = 0; i < n; i++) {
//                nums1[i+m]= nums2[i];
//            }
//            Arrays.sort(nums1);
//            List<Integer> resultList = Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new));
//            System.out.println(resultList);
//        }else{
//            for (int i = 0; i < nums1.length; i++) {
//                nums1[i]=nums2[i];
//            }
//            Arrays.sort(nums1);
//            List<Integer> resultList = Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new));
//            System.out.println(resultList);
//        }

        for (int i = 0, j =m ; i <n ; i++) {
            nums1[j]=nums2[i];
            j++;

        }
        Arrays.sort(nums1);
        List<Integer> resultList = Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new));
        System.out.println(resultList);

    }
}
public class MergeSortedArray {
    public static void main(String[] args){
        Solution1 s1 = new Solution1();
        s1.merge(new int[]{3,5},2,new int[]{},0);

    }
}


