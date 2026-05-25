// Last updated: 5/25/2026, 7:16:02 PM
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(c);
            } else if (c == '(') {
                sb.append(c);
                open++;
            } else if (c == ')' && open > 0) {
                sb.append(c);
                open--;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && open-- > 0) continue;
            res.append(c);
        }
        return res.reverse().toString();
    }
}
