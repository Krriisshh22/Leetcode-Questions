class Solution {
    public String concat (Stack<String> s, String str){
        if (s.empty())
        return str;

        String temp = s.pop();
        str = concat(s, str);
        str += temp;
        return str;
    }
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String[] parts = path.split("/");
        s.push("/");
        for (int i = 0; i<parts.length; i++){
            if (parts[i].trim().isEmpty())
            continue;

            else if (parts[i].charAt(0) != '.'){
                s.push(parts[i]);
            }

            else{
                if (parts[i].equals("."))
                continue;
                else if (parts[i].equals("..")){
                    s.pop();
                    if (!s.empty())
                    s.pop();
                    else if (s.empty())
                    s.push("/");

                    continue;
                }
                else
                s.push(parts[i]);
            }
            if (i < parts.length-1)
            s.push("/");
        }
        

        if (s.peek().equals("/"))
        s.pop();

        if (s.empty())
        return "/";
        String str="";

        str = concat(s, str);

        // String str2 ="";
        // for (int i = str.length()-1; i>=0; i--){
        //     str2 += str.charAt(i);
        // }
        return str;
    }
}