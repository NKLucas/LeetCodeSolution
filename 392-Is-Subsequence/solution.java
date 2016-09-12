public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null){
            return true;
        }
        if (t == null){
            return false;
        }
        if (s.length() == 0){
            return true;
        }
        if (t.length() == 0){
            return false;
        }
        
        int tLength = t.length();
        int sLength = s.length();
        
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < sLength){
            char c = s.charAt(sIndex);
            while (tIndex < tLength){
                if (c == t.charAt(tIndex)){
                    tIndex += 1;
                    break;
                }
                tIndex += 1;
            }
            sIndex += 1;
            if (tIndex >= tLength && sIndex < sLength) {
                return false;
            }
            
        }
        return true;
    }
}