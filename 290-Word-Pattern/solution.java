public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] sList = str.split(" ");
        if (pattern.length() != sList.length){
            return false;
        }
        HashMap<Character, String> dict = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++){
            char now = pattern.charAt(i);
            if (!dict.containsKey(now) && !set.contains(sList[i])){
                dict.put(now, sList[i]);
                set.add(sList[i]);
            } else {
                if (dict.containsKey(now) && !dict.get(now).equals(sList[i])){
                    return false;
                }
                if (!dict.containsKey(now) && set.contains(sList[i])){
                    return false;
                }
            }
        }
        return true;
    }
}