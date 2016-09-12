public class Solution {
    public int maxRotateFunction(int[] nums) {
        // The brute force solution is just calculate every situation and get the max......
        // The time complexity is O(n2)
        if (nums == null || nums.length == 0){
            return 0;
        }        
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++){
            int sum = 0;
            for (int j = 0; j < length; j++){
                int factor = 0;
                if (j >= i){
                    factor = j - i;
                } else {
                    factor = length - i + j;
                }
                int prod = factor * nums[j];
                sum += prod;
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}