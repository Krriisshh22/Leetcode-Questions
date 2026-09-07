class Solution {
    public long countSubstrings(String s, char c) {
        long count =0, k =0;
        for (long i =0; i<s.length(); i++){
            int n = (int)i;
            if (s.charAt(n) == c){
                k++;
                count +=k;
            }
        }
        return count;
    }
}