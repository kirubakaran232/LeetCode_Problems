// Last updated: 5/25/2026, 7:08:18 PM
class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}