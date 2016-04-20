public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i + 1;
        }
        List<Integer> temp = new LinkedList<Integer>();
        combineHelper(nums, result, temp, 0, k);
        return result;
    }
    
    private void combineHelper(int[] nums, List<List<Integer>> result, List<Integer> temp, int pos, int k){
        if (temp.size() == k){
            result.add(new LinkedList<Integer>(temp));
            return;
        }
        while(pos < nums.length){
            temp.add(nums[pos]);
            combineHelper(nums, result, temp, pos + 1, k);
            temp.remove(temp.size() - 1);
            pos += 1;
        }
    }
}