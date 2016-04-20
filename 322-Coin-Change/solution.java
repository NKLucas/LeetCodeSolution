public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] change = new int[amount + 1];
        change[0] = 0;
        for (int i = 1; i <= amount; i++){
            change[i] = -1;
        }
        for (int i = 0; i <= amount; i++){
            if (change[i] < 0){
                continue;
            }
            for (int c : coins){
                if (i + c > amount){
                    continue;
                } else {
                    if (change[i+c] < 0 || change[i+c] > change[i] + 1){
                        change[i+c] = change[i] + 1;
                    }
                }
                
            }
        }
        return change[amount];
    }
}