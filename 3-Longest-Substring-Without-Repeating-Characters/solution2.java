public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        int leftBound = 0;
        int longest = 0;
        
        for (int i = 0; i < s.length(); i++){
            if (set.contains(s.charAt(i))){
                while(leftBound < i && s.charAt(leftBound) != s.charAt(i)){
                    set.remove(s.charAt(leftBound));
                    leftBound += 1;
                }
                leftBound += 1;
            } else {
                set.add(s.charAt(i));
                longest = Math.max(longest, i - leftBound + 1);
            }
        }
        return longest;
        
    }
}