class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1, c2 = cost2, cb = costBoth, n1 = need1, n2 = need2;
        long ans =0;
        long pairs = Math.min(n1, n2);
        ans += Math.min(cb, c1+c2)*pairs;

        n1 -= pairs;
        n2 -= pairs;

        if (n1 > 0)
            ans += n1*Math.min(cb, c1);
        if (n2 > 0)
            ans += n2*Math.min(cb, c2);
        
        return ans;
    }
}