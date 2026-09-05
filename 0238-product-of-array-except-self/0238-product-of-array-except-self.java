class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zero = 0;
        for (int i =0; i<nums.length; i++){
            if (nums[i] == 0){
                zero++;
                continue;
            }
            prod *= nums[i];
        }

        int ans[] = new int[nums.length];
        if (zero == 0){
            for (int j =0; j<nums.length; j++){
                ans[j] = prod/nums[j];
            }
        }
        else if (zero ==1){
            for (int j =0; j<nums.length; j++){
                if (nums[j] != 0)
                ans[j] = 0;
                else
                ans[j] = prod;
            }  
        }
        else
        return ans;

        return ans;
    }
}