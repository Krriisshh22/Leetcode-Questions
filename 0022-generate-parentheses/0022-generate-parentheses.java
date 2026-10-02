class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generateParenthesisMemo("", 0, 0, n, ans);
        return ans;
    }
    public void generateParenthesisMemo(String str, int open, int close, int n, List<String> ans){
        if(str.length() == 2*n){
            ans.add(str);
            return;
        }
    
        if(open < n){
            generateParenthesisMemo(str + "(", open + 1, close, n, ans);
        }

        if(close < open){
            generateParenthesisMemo(str + ")", open , close + 1, n, ans);
        }
    }
}