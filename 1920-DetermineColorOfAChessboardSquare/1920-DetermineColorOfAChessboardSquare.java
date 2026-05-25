// Last updated: 5/25/2026, 7:13:32 PM
class Solution {
    public boolean squareIsWhite(String s) {
        return (s.charAt(0) - 'a' + 1 + s.charAt(1) - '0') % 2 != 0;
    }
}