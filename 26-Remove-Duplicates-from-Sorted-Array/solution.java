public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }
        int curr = 0;
        int runner = 1;
        while(runner < nums.length){
            while(runner < nums.length && nums[curr] == nums[runner]){
                runner += 1;
            }
            if (runner < nums.length){
                int temp = nums[runner];
                nums[runner] = nums[curr + 1];
                nums[curr + 1] = temp;
                curr += 1;
                runner += 1;
            }
        }
        return curr + 1;
    }
}