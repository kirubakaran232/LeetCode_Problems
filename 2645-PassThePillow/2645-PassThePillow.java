// Last updated: 5/25/2026, 7:10:23 PM
class Solution {
    public int passThePillow(int n, int time) {
        return n - Math.abs(n - 1 - time % (n * 2 - 2));
    }
}