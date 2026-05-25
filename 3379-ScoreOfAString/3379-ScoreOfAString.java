// Last updated: 5/25/2026, 7:08:35 PM
class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            total += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return total;
    }
}