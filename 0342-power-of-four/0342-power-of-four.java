class Solution {
    public boolean power (int n, int i){
        if (n<Math.pow(4, i))
        return false;
        if (n==Math.pow(4, i))
        return true;

        return power(n, i+1);
    }
    public boolean isPowerOfFour(int n) {
        return power(n, 0);
    }
}