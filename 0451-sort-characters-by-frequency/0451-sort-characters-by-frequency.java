class Solution {
    public String frequencySort(String s) {

        int[][] freq = new int[128][2];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch][0] = ch;
            freq[ch][1]++;
        }
        
        Arrays.sort(freq, (a, b) -> b[1] - a[1]);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            for (int j = 0; j < freq[i][1]; j++) {
                sb.append((char) freq[i][0]);
            }
        }

        return sb.toString();
    }
}