public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        return wordHelper(s, wordDict, 0);
    
    }
    
    private boolean wordHelper(String s, Set<String> wordDict, int pos){
        if (pos >= s.length()){
            return true;
        }
        for (int i = pos; i < s.length(); i++){
            String sub = s.substring(pos, i+1);
            if (wordDict.contains(sub)){
                boolean result = wordHelper(s, wordDict, i + 1);
                if (result){
                    return true;
                }
            }
        }
        return false;
    }
}