public class Solution {
    public int minPatches(int[] nums, int n) {
        int index = 0;
        int count = 0;
        long currSum = 1;
        while (currSum <= n){
            if (index < nums.length && nums[index] <= currSum){
                currSum += nums[index];
                index += 1;
            } else {
                currSum *= 2;
                count += 1;
            }
        }
        return count;
    }
}