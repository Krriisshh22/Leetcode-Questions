class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;

        int leftM = 0;
        int rightM = 0;
        int ans = 0;
        while (left < right){
            leftM = Math.max(height[left], leftM);
            rightM = Math.max(height[right], rightM);
            if (leftM < rightM){
                ans += leftM-height[left];
                left++;
            }
            else{
                ans += rightM-height[right];
                right--;
            }
        }
        return ans;
    }
}