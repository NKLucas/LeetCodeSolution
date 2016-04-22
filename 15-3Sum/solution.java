public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums == null || nums.length < 3){
            return result;
        }
        
        
        // sort the arrays before we search. Takes O(nlogn) time
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; )
        
    }
}