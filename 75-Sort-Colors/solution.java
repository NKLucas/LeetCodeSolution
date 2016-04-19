public class Solution {
    public void sortColors(int[] nums) {
        int[] counting = new int[3];
        for (int v : nums){
            counting[v] += 1;
        }
        for(int i = 1; i < 3; i++){
            counting[i] += counting[i-1];
        }
        int count = 0;
        int total = nums.length;
        while(count < total){
            if (count < counting[0]){
                nums[count] = 0;
            } else if (count < counting[1]){
                nums[count] = 1;
            } else {
                nums[count] = 2;
            }
            count += 1;
        }
        return;
    }
}