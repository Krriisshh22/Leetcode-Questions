class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        right[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            right[i] = Math.max(height[i], right[i+1]);
        }

        left[0] = height[0];
        for (int j =1; j<n; j++){
            left[j] = Math.max(height[j], left[j-1]);
        }

        int sum = 0;
        for (int k =0; k<n; k++){
            sum += Math.min(left[k], right[k])-height[k];
        }

        return sum;
    }
}