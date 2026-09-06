class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();

        int ans[] = new int[nums.length];
        int n = nums.length;
        for (int i = (2*n)-1; i>=0; i--){
            while (!s.empty() && nums[s.peek()] <= nums[i%n]){
                s.pop();
            }

            if (i<n){

                if (s.empty())
                ans[i] = -1;
                else
                ans[i] = nums[s.peek()];
            }

            s.push(i%n);
        }

        return ans;
    }
}