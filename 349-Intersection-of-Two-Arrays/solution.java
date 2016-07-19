public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        
        HashSet<Integer> existingNums = new HashSet<>();
        for (int i : nums1){
            existingNums.add(i);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i : nums2){
            if (existingNums.contains(i)){
                resultSet.add(i);
            }
        }
        
        int size = resultSet.size();
        int[] result = new int[size];
        int index = 0;
        for(int i : resultSet){
            result[index] = i;
            index += 1;
        }
        return result;    
    }
}