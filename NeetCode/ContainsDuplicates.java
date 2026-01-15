import java.util.HashSet;

public class ContainsDuplicates {
    private boolean containsDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)) return true;
        }

        return false;
    }

    public static void main(String[] args){
        ContainsDuplicates obj1 = new ContainsDuplicates();
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {1, 2, 3, 4, 2};
        System.out.println(obj1.containsDuplicates(nums));
        System.out.println(obj1.containsDuplicates(nums1));
    }
}
