public class Solution {
    public boolean canJump(int[] nums) {
        int rightMost = 0;
        for(int i = 0; i < nums.length; i++){
            if (i <= rightMost){
                rightMost = Math.max(rightMost, i + nums[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}