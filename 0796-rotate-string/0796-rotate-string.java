class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal))
            return true;
        String temp;
        int n = s.length();
        for (int i =1; i<n; i++){
            temp = s.substring(i, n)+s.substring(0, i);
            if (temp.equals(goal))
                return true;
        }
        return false;
    }
}