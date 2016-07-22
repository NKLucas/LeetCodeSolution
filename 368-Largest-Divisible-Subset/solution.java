public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0){
			return new ArrayList<Integer>();
		}

        Arrays.sort(nums);
        int length = nums.length;
        int[] dp = new int[length];
        int[] prev = new int[length];
        for(int i = 0; i < length; i++){
        	dp[i] = 1;
        	prev[i] = i;
        }

        int index = 0;
        int count = 1;
        for(int i = 1; i < length; i++){
        	for (int j = i - 1; j >= 0; j--){
        		if (nums[i] % nums[j] == 0){
        		    if (dp[j] + 1 > dp[i]){
        		        dp[i] = dp[j] + 1;
        		        prev[i] = j;
        		    }
        			
        			if (count < dp[i]){
        				count = dp[i];
        				index = i;
        			}
        		}
        	}
        }

        ArrayList<Integer> result = new ArrayList<>();
        
        while(index != prev[index]){
            result.add(nums[index]);
            index = prev[index];
        }
        result.add(nums[index]);
        
        return result;
        
    }
}