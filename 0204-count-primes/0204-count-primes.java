class Solution {
    public int countPrimes(int n) {
        if (n<=2)
        return 0;
        int c=0;
        
        boolean isPrime[] = new boolean[n];
        for (int i =2; Math.pow(i,2) <n; i++){
            if (!isPrime[i]){
                for (int j = i*i; j<n; j+=i){
                    isPrime[j] = true;
                }
            }
        }

        for (int j=2 ; j<n; j++){
            if (isPrime[j]==false)
            c++;
        }
        return c;
    }
}