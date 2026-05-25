// Last updated: 5/25/2026, 7:07:47 PM
class Solution {
    public boolean canAliceWin(int n) {
        boolean turn = false;
        int p = 10;
        while (n >= p) {
            n -= p;
            p -= 1;
            turn = !turn;
        }
        return turn;
    }
}