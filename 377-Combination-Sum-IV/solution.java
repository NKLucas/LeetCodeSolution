public class Solution {
    public int combinationSum4(int[] nums, int target) {
         if (nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        boolean[] reachable = new boolean[target + 1];
        reachable[0] = true;
        int[] counter = new int[target + 1];
        counter[0] = 1;
        
        for (int i = 1; i <= target; i++){
            for (int j = 0; j < nums.length; j++){
                if (i - nums[j] < 0){
                    break;
                }
                if (i - nums[j] >= 0 && reachable[i - nums[j]]){
                    reachable[i] = true;
                    counter[i] += counter[i - nums[j]];
                }
            }
        }
        return counter[target];
        
    }
}