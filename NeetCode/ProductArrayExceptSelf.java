import java.util.Arrays;

public class ProductArrayExceptSelf {
    private int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix *= nums[i+1];
            result[i] *= suffix;
        }

        return result;
    }

    public static void main(String[] args){
        ProductArrayExceptSelf obj1 = new ProductArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(obj1.productExceptSelf(nums)));
    }
}
