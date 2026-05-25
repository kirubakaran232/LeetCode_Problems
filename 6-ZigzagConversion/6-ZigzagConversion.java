// Last updated: 5/25/2026, 7:23:51 PM
class Solution {
    public String convert(String s, int n) {
        if (n == 1 || s.length() <= n)
            return s;
        StringBuilder sb[] = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            sb[i] = new StringBuilder();
        }
        int dir = 1, r = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb[r].append(ch);
            if (r == 0)
                dir = 1;
            else if (r == n - 1)
                dir = -1;
            r += dir;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }
}