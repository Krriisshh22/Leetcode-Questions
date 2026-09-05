class Solution {
    public int firstStableIndex(int[] nums, int k) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length-1;
        s.push(n);
        for (int i =n-1; i>=0; i--){
            if (nums[i]<nums[s.peek()])
            s.push(i);
        }
        int max = nums[0];
        int minI = s.peek();

        for (int x =0; x<nums.length; x++){
            if (x>minI){
                s.pop();
                if (!s.empty())
                minI = s.peek();
            }

            max = Math.max (max, nums[x]);

            if (max-nums[minI] <= k)
            return x;
        }
        return -1;
    }
}