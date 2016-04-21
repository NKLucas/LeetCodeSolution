public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        HashMap<Character, Integer> hash = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;
        int longest = 1;
        for (int i = 0; i < s.length(); i++){
            endIndex = i;
            if (hash.containsKey(s.charAt(i))){
                if (endIndex - startIndex > longest){
                    longest = endIndex - startIndex;
                }
                int prevIndex = hash.get(s.charAt(i));
                for (int j = startIndex; j <= prevIndex; j++){
                    hash.remove(s.charAt(j));
                }
                startIndex = prevIndex + 1;
            } else {
                longest = Math.max(longest, endIndex - startIndex + 1);
            }
            hash.put(s.charAt(i), i);
        }
        //System.out.println(startIndex + "   " + endIndex);
        return longest;        
    }
}