package ArraysAndHashing;

public class ConcatenateArray {
    public int[] concatenate(int[] nums){
        int n = nums.length;
        int[] result = new int[2 * n];
        for(int i = 0; i < n; i++){
            result[i] = nums[i];
            result[n+i] = nums[i];
        }

        return result;
    }
}
