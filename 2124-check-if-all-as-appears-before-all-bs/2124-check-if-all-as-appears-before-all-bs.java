class Solution {
    public boolean checkString(String s) {
        int a = s.indexOf("b");
        if (a == -1)
            return true;
        for (int i = a+1; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a')
                return false;
        }
        return true;
    }
}