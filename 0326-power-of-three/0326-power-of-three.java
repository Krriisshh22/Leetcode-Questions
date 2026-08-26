class Solution {
    public boolean power (int n, int i){
        if (n<Math.pow(3, i))
        return false;
        if (n==Math.pow(3, i))
        return true;

        return power(n, i+1);
    }
    public boolean isPowerOfThree(int n) {
        return power(n, 0);
    }
}