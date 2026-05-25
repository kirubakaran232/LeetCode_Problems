// Last updated: 5/26/2026, 12:10:03 AM
1class Solution {
2    void generate(List<String> ans, String s, int open, int close, int n) {
3        if (open == n && close == n) {
4            ans.add(s);
5            return;
6        }
7        if (open > close)
8            generate(ans, s + ")", open, close + 1, n);
9        if (open < n)
10            generate(ans, s + "(", open + 1, close, n);
11    }
12    public List<String> generateParenthesis(int n) {
13        List<String> ans = new ArrayList<>();
14        generate(ans, "", 0, 0, n);
15        return ans;
16    }
17}