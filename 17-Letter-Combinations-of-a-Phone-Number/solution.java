public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        List<String> result = new LinkedList<>();
        if (digits == null || digits.length() == 0){
            return result;
        }
        
        // initialize the map.
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        
        String temp = "";
        combineHelper(digits, temp, result, 0, map);
        return result;
    }
    
    private void combineHelper(String digits, String temp, List<String> result, int pos, HashMap<Character, String> map){
        if (pos >= digits.length()){
            result.add(temp);
            return;
        }
        for(char c : map.get(digits.charAt(pos)).toCharArray()){
            combineHelper(digits, temp + c, result, pos + 1, map);
        }
        
    }
}
