class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<1)
        return false;
        int i = n& (n-1);
        if (i==0)
        return true;
        else 
        return false;
    }
}