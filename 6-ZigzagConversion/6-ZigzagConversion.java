// Last updated: 6/10/2026, 11:35:01 PM
1class Solution {
2    public String convert(String s, int n) {
3        if (n == 1 || s.length() <= n)
4            return s;
5        StringBuilder sb[] = new StringBuilder[n];
6        for (int i = 0; i < n; i++) {
7            sb[i] = new StringBuilder();
8        }
9        int dir = 1, r = 0;
10        for (int i = 0; i < s.length(); i++) {
11            char ch = s.charAt(i);
12            sb[r].append(ch);
13            if (r == 0)
14                dir = 1;
15            else if (r == n - 1)
16                dir = -1;
17            r += dir;
18        }
19        StringBuilder res = new StringBuilder();
20        for (int i = 0; i < n; i++) {
21            res.append(sb[i]);
22        }
23        return res.toString();
24    }
25}