public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index += 1;
            }
        }
        return index;
        
        
        // This version is not working, because the val is not moved.
        // int count = 0;
        // for (int v : nums){
        //     if (v == val){
        //         count += 1;
        //     }
        // }
        // return nums.length - count;
        
    }
}