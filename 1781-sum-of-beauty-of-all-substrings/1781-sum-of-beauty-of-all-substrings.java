class Solution {
    public int beauty(String s){
        int freq[] = new int[26];
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j =0; j<26; j++){
            if (freq[j] > 0){
                min = Math.min(min, freq[j]);
                max = Math.max(max, freq[j]);
            }
        }

        return max-min;
    }
    public int beautySum(String s) {
        int sum = 0;
        for (int i =0; i<s.length(); i++){
            for (int j =i; j<s.length(); j++){
                if (beauty(s.substring(i, j + 1)) > 0)
                    sum += beauty(s.substring(i, j + 1));
            }
        }
        return sum;
    }
}