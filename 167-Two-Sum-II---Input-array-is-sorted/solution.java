public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int start = 1;
        int end = length;
        int sum = numbers[start -1] + numbers[end - 1];
        while (sum != target && start < end) {
            if (sum > target) {
                end -= 1;
            } else {
                start += 1;
            }
            sum = numbers[start - 1] + numbers[end - 1];
        }
        int[] result = {start, end};
        return result;
    }
}