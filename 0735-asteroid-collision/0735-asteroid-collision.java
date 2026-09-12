class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int i =0; i<asteroids.length; i++){
            if (asteroids[i] > 0)
            s.push(asteroids[i]);
            else{
                while (!s.empty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])){
                   s.pop();
                }
                if (!s.empty() && s.peek() == Math.abs(asteroids[i]))
                s.pop();
                else if (s.empty() || s.peek() < 0)
                s.push(asteroids[i]);
            }
        }
        int n = s.size();
        int ans[] = new int[n];
        for (int i = n-1; i>=0; i--){
            ans[i] = s.pop();
        }

        return ans;
    }
}