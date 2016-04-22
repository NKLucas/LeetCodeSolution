public class Solution {
    public boolean canJump(int[] nums) {
        boolean[] canReach = new boolean[nums.length];
        canReach[0] = true;
        for(int i = 0; i < nums.length; i++){
            if (canReach[i]) {
                for(int j = i + nums[i]; j > i; j--){
                    if (j < nums.length){
                        canReach[j] = true;
                    }
                }
            }
        }
        return canReach[nums.length - 1];
    }
}