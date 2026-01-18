package ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)) return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 2};
        int[] nums2 = {1, 2 ,3, 4};
        System.out.println(containsDuplicates(nums));
        System.out.println(containsDuplicates(nums2));
    }
}
