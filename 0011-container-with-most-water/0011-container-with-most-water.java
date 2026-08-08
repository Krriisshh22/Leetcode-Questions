class Solution {
    public int maxArea(int[] height) {
        int si = 0;
        int ei = height.length-1;
        int max_vol=0;
        while (si<ei){
            int vol = Math.min(height[si], height[ei])*(ei-si);
            max_vol = Math.max(max_vol, vol);
            if (height[si]>height[ei])
            ei--;
            else
            si++;
        }
        return max_vol;
    }
}