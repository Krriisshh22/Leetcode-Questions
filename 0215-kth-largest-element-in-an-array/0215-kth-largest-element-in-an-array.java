class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        for (int j =1; j<k; j++){
            pq.remove();
        }

        return pq.peek();
    }
}