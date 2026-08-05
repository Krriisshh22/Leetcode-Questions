class Solution {
    public int strStr(String haystack, String needle) {
        int a = needle.length();
        for (int i = 0; i<haystack.length()-a+1; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                String test = haystack.substring(i, i+a);
                if (test.equals(needle))
                return i;
            }
        }
        return -1;
    }
}