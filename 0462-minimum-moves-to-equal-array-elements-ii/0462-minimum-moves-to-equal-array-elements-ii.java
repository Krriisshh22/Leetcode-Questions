class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        int midI = n/2;
        int mid = nums[n/2];
        for (int i =0; i<midI; i++){
            ans += mid-nums[i];
        }
        for (int j = midI+1; j<n; j++){
            ans += nums[j]-mid;
        }
        return ans;
    }
}