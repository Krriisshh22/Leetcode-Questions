class Solution {
    public int sum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
    public String ans (String s, int k){
        int n = s.length();
        StringBuilder sb = new StringBuilder ("");

        for (int i = 0; i<n; i+=k){
            int ans = ((i+k) < n) ? sum(s.substring(i, i+k)) : sum(s.substring(i, n));
            sb.append(String.valueOf(ans));
        }
        return sb.toString();
    }
    public String digitSum(String s, int k) {
        if (s.length() <= k)
            return s;
        String ans = ans(s, k);
        while (ans.length() > k){
            ans = ans(ans, k);
        }
        return ans;
    }
}