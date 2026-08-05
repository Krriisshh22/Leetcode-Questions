class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        s = s.toLowerCase();
        for (int i =0; i<s.length(); i++){
            if (((int)s.charAt(i) >= 97 && (int)s.charAt(i)<=122) || ((int)s.charAt(i) >= 48 && (int)s.charAt(i)<=57 ))
            str = str+ s.charAt(i);
        }

        for (int j =0; j<str.length()/2; j++){
            if (str.charAt(j) != str.charAt(str.length()-1-j))
            return false;
        }
        return true;
    }
}