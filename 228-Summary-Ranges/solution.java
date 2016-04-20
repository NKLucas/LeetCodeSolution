public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<String>();
        if (nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        int start, end;
        int index = 0;
        while (index < nums.length){
            start = index;
            int curr = nums[index];
            while (index + 1 < nums.length && nums[index + 1] == curr + 1){
                index += 1;
                curr += 1;
            }
            end = index;
            String temp = getRange(nums, start, end);
            result.add(temp);
            index += 1;
        }
        return result;
    }
    
    private String getRange(int[] nums, int start, int end){
        String s = "";
        s += Integer.toString(nums[start]);
        if (start != end){
            s += "->";
            s += Integer.toString(nums[end]);
        }
        return s;
    }
}