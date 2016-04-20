public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0){
            return 0;
        }
        
        int max = 0;
        for (int c : citations){
            max = Math.max(max, c);
        }
        int[] count = new int[max + 1];
        for (int c : citations){
            count[c] += 1;
        }
        int total = citations.length;
        int result = 0;
        for (int i = 1; i <= max; i++){
            count[i] += count[i-1];
            if (total - count[i - 1] >= i){
                result = i;
            }
        }
        return result;
    }
}