// Last updated: 5/25/2026, 7:19:10 PM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}