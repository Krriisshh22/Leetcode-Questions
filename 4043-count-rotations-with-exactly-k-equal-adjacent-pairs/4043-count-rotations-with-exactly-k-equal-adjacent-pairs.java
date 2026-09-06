class Solution {
    public int countRotations(String s, int k) {
        int count =0, ans=0;
        String temp = s;
        int n = s.length();
        for (int i =0; i<n; i++){
            temp = temp+ s.charAt(i);
            String str = temp.substring(i+1, temp.length());
            for (int j =0; j<n-1; j++){
                if (str.charAt(j) == str.charAt(j+1)){
                    count++;
                }
            }
            if (count == k)
                ans++;
            count = 0;
        }
        return ans;
    }
}