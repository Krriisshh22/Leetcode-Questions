class Solution {
    public String reverseWords(String s) {
        String sb = "";
        String words[] = s.split(" ");
        for (int i=words.length-1; i>=0; i--){
            if (!words[i].equals(""))
            sb = sb+words[i]+" ";
        }
        return sb.trim();
    }
}