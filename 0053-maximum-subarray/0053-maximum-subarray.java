class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i<nums.length; i++){
            cs += nums[i];
            ms = Math.max(cs, ms);
            if (cs < 0)
                cs = 0;

        }

        // if (ms == 0){
        //     ms = Integer.MIN_VALUE;
        //     for (int j =0; j<nums.length; j++){
        //         ms = Math.max(ms, nums[j]);
        //     }
        // }
        return ms;
    }
}