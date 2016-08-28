public class Solution {
    public char findTheDifference(String s, String t) {
        int sLength = s.length();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < sLength; i++){
            char c = s.charAt(i);
            if (count.containsKey(c)){
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        
        for (int i = 0; i < sLength + 1; i++){
            char c = t.charAt(i);
            if (count.containsKey(c) && count.get(c) > 0){
                count.put(c, count.get(c) - 1);
            } else {
                return c;
            }
        }
        return 'a';
        
    }
}