// Last updated: 5/25/2026, 7:19:21 PM
class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        while (n >= row) {
            n -= row;
            row++;
        }
        return row - 1;
    }
}