class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int max =0;
        int i =0;
        while (i<nums.length && i<=max){
            int nextmax = i + nums[i];
            max = Math.max(max, nextmax);
            i++;
        }
        
        if (max>=nums.length-1)
            return true;
        else
            return false;
    }
}