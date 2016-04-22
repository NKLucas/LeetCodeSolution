public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if (nums == null || nums.length == 0){
            return result;
        }
        
        int firstIndex = findFirst(nums, target);
        if (firstIndex == -1){
            return result;
        }
        int secondIndex = findLast(nums, target);
        result[0] = firstIndex;
        result[1] = secondIndex;
        return result;
    }
    
    private int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int mid = (start + end) / 2;
            if (nums[mid] >= target){
                end = mid;
            } else if (nums[mid] < target){
                start = mid + 1;
            }
        }
        if (nums[start] == target){
            return start;
        } else {
            return -1;
        }
    }
    
    
    private int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start < end - 1){
            int mid = (start + end) / 2;
            if (nums[mid] <= target){
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[end] == target){
            return end;
        } else if (nums[start] == target) {
            return start;
        } else {
            return -1;
        }
    }
    
    
    
    
    
    
}