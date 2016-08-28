public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (count.containsKey(c)){
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (count.get(c) < 2){
                return i;
            }
        }
        return -1;
    }
}