package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int n = nums.length;
        int left = 0, right = n-1;
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1, 4, 6, 8, 14};
        System.out.println(binarySearch(nums, 6));
        System.out.println(binarySearch(nums, 7));
    }
}
