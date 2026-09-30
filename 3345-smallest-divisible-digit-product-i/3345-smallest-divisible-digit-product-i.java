class Solution {
    public static int prod (int n){
        int p = 1;
        while (n>0){
            p *= n%10;
            n /= 10;
        }

        return p;
    }
    public int smallestNumber(int n, int t) {
        while (true){
            int a = prod(n);
            if (a%t == 0)
                return n;
            
            n++;
        }
    }
}