// Last updated: 5/25/2026, 7:11:26 PM
class Solution {
        public int fillCups(int[] A) {
        int mx = 0, sum = 0;
        for(int a: A) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
}