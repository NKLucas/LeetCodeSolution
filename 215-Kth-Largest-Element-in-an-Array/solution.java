public class Solution {
    public int findKthLargest(int[] nums, int k) {
        // use PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int i = 0; i < nums.length; i++){
            if(pq.size() < k){
                pq.add(nums[i]);
            } else {
                if (nums[i] > pq.peek()){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
    }
}