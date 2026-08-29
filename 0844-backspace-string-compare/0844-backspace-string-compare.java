class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> c1 = new Stack<>();
        Stack<Character> c2 = new Stack<>();
        
        int l1=0, l2=0;
        for (int i = 0; i <s.length(); i++){
            if (s.charAt(i) == '#' && c1.isEmpty())
            continue;
            if (s.charAt(i) == '#' && !c1.isEmpty())
            c1.pop();
            else
            c1.push(s.charAt(i));
        }

        for (int j = 0;  j<t.length(); j++){
            if (t.charAt(j) == '#' && c2.isEmpty())
            continue;
            if (t.charAt(j) == '#' && !c2.isEmpty())
            c2.pop();
            else
            c2.push(t.charAt(j));
        }

        while (!c1.isEmpty() && !c2.isEmpty()){
            if (c1.peek() != c2.peek())
            return false;
            else{
                c1.pop();
                c2.pop();
            }
        }

        if (c1.isEmpty() && c2.isEmpty())
        return true;
        else
        return false;
    }
}