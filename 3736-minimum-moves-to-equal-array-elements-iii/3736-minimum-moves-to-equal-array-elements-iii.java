class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int n = nums.length-1;
        for (int i =0; i<n; i++){
            ans += nums[n]-nums[i];
        }
        return ans;
    }
}