public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0){
            return 0;
        }
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) != ' '){
            end -= 1;
        }
        return s.length() - 1 - end; 
    }
}