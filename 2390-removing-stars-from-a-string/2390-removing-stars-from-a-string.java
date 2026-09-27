class Solution {
    public String removeStars(String s) {
        // Stack<Character> st = new Stack<>();

        // for (int i =0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if (ch == '*9'){
        //         st.pop();
        //     }
        //     else{
        //         st.push(ch);
        //     }
        // }

        // StringBuilder sb = new StringBuilder("");
        // while (!st.isEmpty()){
        //     sb.append(st.pop());
        // }
        // return  sb.reverse().toString();

        StringBuilder sb = new StringBuilder("");
        for (int i =0; i<s.length(); i++){
            char ch= s.charAt(i);

            if (ch == '*'){
                sb = new StringBuilder(sb.substring(0, sb.length()-1));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}