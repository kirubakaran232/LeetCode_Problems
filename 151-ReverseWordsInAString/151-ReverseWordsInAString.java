// Last updated: 5/25/2026, 7:21:32 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String r[] = s.split("\\s+");
        for (int i = r.length - 1; i >= 0; i--) {
            res.append(r[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}