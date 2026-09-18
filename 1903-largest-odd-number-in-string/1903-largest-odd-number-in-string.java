class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        while (sb.length() > 0) {
            int n = Character.getNumericValue(sb.charAt(sb.length() - 1));
            if (n % 2 != 0)
                return sb.toString();

            sb.deleteCharAt(sb.length() - 1);
        }
        return "";
    }
}