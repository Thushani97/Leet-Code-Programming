import java.util.*;
import java.util.stream.Collectors;

public class Q2_RemoveElement {
    public static void main(String[] args) {
        Solution21 s1 = new Solution21();
        s1.removeDuplicates(new int[]{-3,-1,0,0,0,3,3});
    }
}
class Solution21 {
    public int removeDuplicates(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int len = nums.length-set.size();
        int j = 0;
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
        while (j<len){
            list.add(0);
            j++;
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));
        return set.size();
    }
}

//class Solution22 {
//    public int removeDuplicates(int[] nums) {
//
//    }
//}