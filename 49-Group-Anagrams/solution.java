public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // to meet the output requirement, strs need to be sorted.
        Arrays.sort(strs);
        
        // This problem requires to write a hash function that make all the anagrams have sam hashcode.
        List<List<String>> result = new LinkedList<List<String>>();
        HashMap<Integer, LinkedList<String>> map = new HashMap<>();
        
        // group the strings together based on the designed getHashCode function.
        for (String s : strs){
            int[] charCount = new int[26];
            for (int i = 0; i < s.length(); i++){
                int index = s.charAt(i) - 'a';
                charCount[index] += 1;
            }
            int hashCode = getHashCode(charCount);
            if (map.containsKey(hashCode)){
                map.get(hashCode).add(s);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(s);
                map.put(hashCode, list);
            }
        }
        
        for(int code : map.keySet()){
            result.add(map.get(code));
        }
        return result;
    }
    
    private int getHashCode(int[] charCount){
        int a = 33;
        int b = 5;
        int hashCode = 0;
        for (int c : charCount){
            hashCode = a * hashCode + c;
            a = a * b;
        }
        return hashCode;
    }
}