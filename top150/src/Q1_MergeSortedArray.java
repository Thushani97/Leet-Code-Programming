import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1_MergeSortedArray {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
//        s1.merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);

//        Solution2 s2 = new Solution2();
//        s2.merge(new int[]{2,0},1, new int[]{1},1);

        Solution3 s3 = new Solution3();
        s3.merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);
    }
}

class Solution3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while (j>=0) {
                System.out.println(j);
            if (i>=0 && nums1[i]>nums2[j]) {
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[m + n];
        int i =0;
        int j =0;
        if (n!=0 && m!=0){
            for (int k = 0; k < m+n;k++) {
                if(nums1[i]!=0){
                    if (nums1[i] <= nums2[j]) {
                        res[k] = nums1[i];
                        i++;
                    } else if (nums1[i] > nums2[j]) {
                        res[k] = nums2[j];
                        j++;
                    }
                }else {
                    res[k] = nums2[j];
                    j++;
                }
            }
        } else if ( m==0) {
            res=nums2;
        } else if (n==0) {
            res=nums1;
        }

        for (int kk = 0; kk < nums1.length; kk++) {
            nums1[kk] = res[kk];
        }
        System.out.println(Arrays.toString(nums1));
    }
}


class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}

