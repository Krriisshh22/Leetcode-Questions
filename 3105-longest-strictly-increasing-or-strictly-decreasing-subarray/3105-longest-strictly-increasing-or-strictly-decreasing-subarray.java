class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, incM = 0, decM = 0;
        int n = nums.length;
        for (int i = 1; i<n ; i++){
            if (nums[i] > nums[i-1])
                inc++;
            else{
                incM = Math.max(inc, incM);
                inc = 1;
            }

            if (nums[i] < nums[i-1])
                dec++;
            else{
                decM = Math.max(dec, decM);
                dec = 1;
            }
        }
        incM = Math.max(inc, incM);
        decM = Math.max(dec, decM);
        
        return Math.max(incM, decM);
    }
}