class Solution {
    public int bin (int nums[], int target, int si, int ei){
        if (si > ei)
        return -1;

        int mid = si + (ei - si)/2;
        if (target == nums[mid])
        return mid;

        if (target > nums[mid]){
            si = mid+1;
            return bin (nums, target, si, ei);
        }
        else{
            ei = mid-1;
            return bin (nums, target, si, ei);
        }
    }
    public int search(int[] nums, int target) {
        return bin(nums, target, 0, nums.length-1);
    }
}