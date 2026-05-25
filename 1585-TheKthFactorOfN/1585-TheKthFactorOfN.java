// Last updated: 5/25/2026, 7:14:54 PM
class Solution {
    public int kthFactor(int n, int k) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) return i;
            }
        }
        return -1;
    }
}