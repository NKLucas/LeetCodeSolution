public class Solution {
    public int integerReplacement(int n) {
        // try to solve this with dynamic programming
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n % 2 == 0) {
            return integerReplacement(n / 2) + 1;
        } else {
            // two options, go higher or go smaller
            int smaller = n - 1;
            
            int bigger = (n + 1) / 2;
            
            if (n == Integer.MAX_VALUE){
                bigger = (n - 1) / 2 + 1;
            }
            return Math.min(integerReplacement(smaller) + 1, integerReplacement(bigger) + 2);
        }
    }
}