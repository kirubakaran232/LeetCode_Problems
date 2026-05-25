// Last updated: 5/25/2026, 7:23:22 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }
        return dividend / divisor;
    }
}
