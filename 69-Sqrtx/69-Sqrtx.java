// Last updated: 5/25/2026, 7:22:44 PM
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1, right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;   
    }
}
