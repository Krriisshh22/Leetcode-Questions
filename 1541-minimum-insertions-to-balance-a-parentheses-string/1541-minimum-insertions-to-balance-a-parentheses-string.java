class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int add =0;
        int open =0;
        for (int i =0; i<n; i++){
            char ch = s.charAt(i);
            if (ch == '(')
                open++;
            
            else{
                if (open > 0){
                    if (i+1 == n){
                        open--;
                        add++;
                        continue;
                    }
                    if (i+1 < n && s.charAt(i+1) != ')'){
                        add++;
                        open--;
                    }
                    else{
                        i++;
                        open--;
                    }
                }
                else{
                    add++;
                    if (i+1 == n){
                        add++;
                    }
                    if (i+1 < n && s.charAt(i+1) != ')'){
                        add++;
                    }
                    else{
                        i++;
                    }
                }
            }
        }
        while (open>0){
            add += 2;
            open--;
        }
        return add;
    }
}