// Last updated: 8/31/2026, 2:00:04 PM
1class Solution {
2    public int countHomogenous(String s) {
3        long c = 0;
4        int l = 0;
5        int MOD = 1000000007;
6        for (int r = 0; r < s.length(); r++) {
7            if (s.charAt(l) == s.charAt(r)) {
8                c += r - l + 1;
9            } else {
10                l = r;
11                c += 1;
12            }
13        }
14        return (int)(c % MOD);
15    }
16}