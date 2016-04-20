public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0){
            return 0;
        }
        int rows = triangle.size();
        int cols = triangle.get(rows - 1).size();
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < cols; i++){
            dp[rows-1][i] = triangle.get(rows - 1).get(i);
        }
        for (int row = rows - 2; row >= 0; row--){
            for (int col = 0; col <= row; col++){
                dp[row][col] = Math.min(dp[row+1][col], dp[row+1][col+1]) + triangle.get(row).get(col);
            }
        }
        return dp[0][0];
        
    }
}