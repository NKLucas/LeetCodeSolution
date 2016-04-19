public class Solution {
    public int uniquePaths(int m, int n) {
        int big = Math.max(m, n) - 1;
        int small = Math.min(m, n) - 1;
        double result = 1;
        while (small > 0){
            result *= (big + small);
            small -= 1;
        }
        small = Math.min(m, n) - 1;
        while (small > 1){
            result /= small;
            small -= 1;
        }
        return (int)result;
    }
}