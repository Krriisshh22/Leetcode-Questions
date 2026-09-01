class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && (height[s.peek()] < height[i])) {
                int pop_height = height[s.peek()];
                s.pop();
                if (s.isEmpty())
                    break;
                int distance = i - s.peek() - 1;
                int min_height = Math.min(height[s.peek()], height[i]) - pop_height;
                ans += distance * min_height;
            }
            s.push(i);
        }
        return ans;
    }
}