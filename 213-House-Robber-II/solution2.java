public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0){
            return 0;
        }
        
        if (length == 1){
            return nums[0];
        }
        
        // dp1 take the 1st element, dp2 doesn't take the 1st element as starting point!
        int[] dp1 = new int[length + 1];
        int[] dp2 = new int[length + 1];
        dp1[1] = nums[0];
        for(int i = 2; i < length; i++){
            dp1[i] = Math.max(dp1[i-1], dp1[i-2] + nums[i-1]);
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + nums[i-1]);
        }
        dp1[length] = dp1[length - 1];
        dp2[length] = Math.max(dp2[length - 1], dp2[length - 2] + nums[length - 1]);
        
        return Math.max(dp1[length], dp2[length]);
    }
}