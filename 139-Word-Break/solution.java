public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int maxLength = getMaxLength(wordDict);
        boolean[] canBreak = new boolean[s.length() + 1];
        canBreak[0] = true;
        for (int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= maxLength; j++){
                if (j <= i && canBreak[i-j] && wordDict.contains(s.substring(i-j, i))){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    
    }
    
    private int getMaxLength(Set<String> wordDict){
        int length = 0;
        for (String s: wordDict){
            if (s.length() > length){
                length = s.length();
            }
        }
        return length;
    }
    
    
    // 方法二：Recursion，可以work，但是时间复杂度太高。
    // public boolean wordBreak(String s, Set<String> wordDict) {
    //     return wordHelper(s, wordDict, 0);
    //
    // }
    
    // private boolean wordHelper(String s, Set<String> wordDict, int pos){
    //     if (pos >= s.length()){
    //         return true;
    //     }
    //     for (int i = pos; i < s.length(); i++){
    //         String sub = s.substring(pos, i+1);
    //         if (wordDict.contains(sub)){
    //             boolean result = wordHelper(s, wordDict, i + 1);
    //             if (result){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
}