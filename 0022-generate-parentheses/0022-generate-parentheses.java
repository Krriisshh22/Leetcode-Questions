class Solution {
    public boolean isValid(String s) {
        int balanced = 0;
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(')
                balanced++;
            else
                balanced--;

            if (balanced<0)
                return false;
        }
        return balanced==0;
        
    }

    public List<String> generate(String curr, int n, List<String> ans){
        if (curr.length()== 2*n){
            if (isValid(curr)){
                ans.add(curr);
            }
            return ans;
        }

        generate(curr+'(', n, ans);
        generate(curr+')', n, ans);
        return ans;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        return generate("", n, ans);
    }
}