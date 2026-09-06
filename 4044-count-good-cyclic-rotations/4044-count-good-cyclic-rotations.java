class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int mid = n/2;
        int count = 0;
        long sumL = 0, sumR = 0;
        for (int j =0; j<mid; j++){
            sumL += nums[j];
            sumR += nums[mid+j];
        }
        if (sumL > sumR)
        count++;
        
        for (int i =0; i<n-1; i++){
            sumL = sumL-nums[i]+nums[(mid+i)%n];
            sumR = sumR-nums[(mid+i)%n]+nums[i];

            if (sumL > sumR)
            count++;
        }
        return count;
    }
}