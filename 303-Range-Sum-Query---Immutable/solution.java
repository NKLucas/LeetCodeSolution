public class NumArray {

    private int[] sum;
    
    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int length = nums.length;
        sum = new int[length + 1];
        sum[0] = 0;
        for (int i = 1; i <= length; i++){
            sum[i] = sum[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if (sum != null){
            return sum[j + 1] - sum[i];
        } else {
            return 0;
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);