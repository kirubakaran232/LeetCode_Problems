// Last updated: 5/25/2026, 7:08:04 PM
class Solution {
    public String winningPlayer(int x, int y) {
        return Math.min(x, y / 4) % 2 == 1 ? "Alice" : "Bob";
    }
}