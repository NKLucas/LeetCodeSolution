public class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;
        for (int i = 0; i < nums.length; i++){
            if (localMax < 0){
                localMax = 0;
            }
            localMax += nums[i];
            if (localMax > globalMax){
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}