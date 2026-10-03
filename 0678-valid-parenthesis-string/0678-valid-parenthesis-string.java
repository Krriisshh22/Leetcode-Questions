class Solution {
    // public boolean check(String s, int c, int idx){
    //     if (c<0)
    //         return false;

    //     if (idx == s.length() )
    //         return (c == 0);

    //     char ch = s.charAt(idx);
    //     if (ch == '(')
    //         return check(s, c+1, idx+1);
    //     else if (ch == ')')
    //         return check(s, c-1, idx+1);
        
    //     return (check(s, c+1, idx+1) || check(s, c-1, idx+1) || check(s, c, idx+1));
    // }
    public boolean checkValidString(String s) {
        int min = 0; 
        int max = 0;
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '('){
                min++;
                max++;
            }
            if (ch == ')'){
                min--;
                max--;
            }
            if (ch == '*'){
                min--;
                max++;
            }
            if (min < 0)
                min=0;
            if (max < 0)
                return false;
        }
        return (min==0);
    }
}