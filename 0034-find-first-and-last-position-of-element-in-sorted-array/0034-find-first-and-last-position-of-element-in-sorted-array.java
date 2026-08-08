class Solution {
    public int first(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                ans = mid;
                ei = mid - 1;
            } 
            else if (nums[mid] < target) 
                si = mid + 1;
            else 
                ei = mid - 1;
        }
        return ans;
    }

    public int last(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                ans = mid;
                si = mid + 1;
            } 
            else if (nums[mid] < target) 
                si = mid + 1;
            else
                ei = mid - 1;
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target), last(nums, target)};
    }
}