public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums == null || nums.length < 3){
            return result;
        }
        
        // sort the arrays before we search. Takes O(nlogn) time
        Arrays.sort(nums);
        
        // get one and find the target = 0 - nums[i] by two pointers.
        for (int i = 0; i < nums.length; i++){
            if (i != 0 && nums[i] == nums[i-1]){
                continue;
            } else {
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right){
                    if (nums[left] + nums[right] == target){
                        List<Integer> temp = new LinkedList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        result.add(temp);
                        left += 1;
                        right -= 1;
                        while (left < right && nums[left] == nums[left - 1]) { // to skip duplicates
						    left++;
					    }
					    while (left < right && nums[right] == nums[right + 1]) { // to skip duplicates
						    right--;
					    }
                    } else if (nums[left] + nums[right] > target){
                        right -= 1;
                    } else {
                        left += 1;
                    }
                }
            }
        }
        return result;
    }
}