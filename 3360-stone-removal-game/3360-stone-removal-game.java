class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        int i =0;
        while (n>0){
            n -= k;
            k--;

            if (i == 0)
                i++;
            else
                i--;
        }

        if (n==0){
            return (i==1) ? true : false;
        }
        else{
            return (i==0) ? true : false;
        }
    }
}