class Solution {
    public static int s (int num[], int tar, int si, int ei){
        if (si>ei)
        return -1;

        int mid = si + (ei-si)/2;
        if (num[mid] == tar)
        return mid;
        if (num[si]<=num[mid]){
            if (num[si]<=tar && tar<=num[mid])
            return s(num, tar, si, mid-1);
            else
            return s(num, tar, mid+1, ei);
        }
        else{
            if (num[mid]<=tar && tar<=num[ei])
            return s(num, tar, mid+1, ei);
            else
            return s(num, tar, si, mid-1);
        }
    }
    public int search(int[] nums, int target) {
        return s(nums, target, 0, nums.length-1);
    }
}