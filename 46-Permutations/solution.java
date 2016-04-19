public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        List<Integer> temp = new LinkedList<>();
        
        permuteHelper(nums, result, temp);
        return result;
    }
    
    private void permuteHelper(int[] nums, List<List<Integer>> result, List<Integer> temp){
        if (temp.size() == nums.length){
            result.add(new LinkedList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (!temp.contains(nums[i])){
                temp.add(nums[i]);
                permuteHelper(nums, result, temp);
                temp.remove(temp.size() - 1);
            }
        }
        
    }
}