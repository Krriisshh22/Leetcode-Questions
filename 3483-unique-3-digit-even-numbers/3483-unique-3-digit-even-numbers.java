class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];
        for (int d : digits){
            freq[d]++;
        }

        int ans = 0;
        for (int i = 100; i<= 998; i += 2){
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;

            freq[a]--;
            freq[b]--;
            freq[c]--;

            if (freq[a] >=0 && freq[b] >=0 && freq[c] >=0)
                ans++;

            freq[a]++;
            freq[b]++;
            freq[c]++;
        }
        return ans;
    }
}