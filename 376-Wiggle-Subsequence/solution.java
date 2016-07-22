public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0){
			return 0;
		}
        int length = nums.length;
        int[] up = new int[length];
        int[] down = new int[length];
        up[0] = 1;
        down[0] = 1;
        // must end with that position number.
        for (int i = 1; i < length; i++){
        	for(int j = 0; j < i; j++){
        		if (nums[j] > nums[i]){
        			down[i] = Math.max(up[j] + 1, down[i]);
        		} else if (nums[j] < nums[i]) {
        			up[i] = Math.max(down[j] + 1, up[i]);
        		}
        	}
        }

        int max = 0;
        for (int i = 0; i < length; i++){
        	max = Math.max(up[i], max);
        	max = Math.max(down[i], max);
        }
        return max;

    }
}