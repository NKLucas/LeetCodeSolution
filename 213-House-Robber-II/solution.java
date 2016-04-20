public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0){
            return 0;
        }
        
        if (length == 1){
            return nums[0];
        }
        // O(n^2)的方法，就是尝试着从任何一个开始，把数组变成两倍长，这样不用考虑circle。
        // 然后看，从谁开始最好。
        // 从接受的结果来看，貌似有O（N）的方法。。。。
        int[] newNums = new int [length * 2];
        for (int i = 0; i < length * 2; i++){
            newNums[i] = nums[i % length];
        }
        int maxValue = 0;
        int[][] dp = new int[length][length + 1];
        for (int i = 0; i < length; i++){
            for (int j = 1; j <= length; j++){
                int now = j + i - 1;
                if (j == 1){
                    dp[i][j] = newNums[i];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i][j-2] + newNums[now]);
                }
                
            }
            maxValue = Math.max(maxValue, dp[i][length - 1]);
        }
        return maxValue;
        
    }
}