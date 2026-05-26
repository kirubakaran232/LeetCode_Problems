// Last updated: 5/26/2026, 9:52:19 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) return x;
4        int left = 1, right = x / 2;
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            long sq = (long) mid * mid;
8            if (sq == x) {
9                return mid;
10            } else if (sq > x) {
11                right = mid - 1;
12            } else {
13                left = mid + 1;
14            }
15        }
16        return right;   
17    }
18}
19