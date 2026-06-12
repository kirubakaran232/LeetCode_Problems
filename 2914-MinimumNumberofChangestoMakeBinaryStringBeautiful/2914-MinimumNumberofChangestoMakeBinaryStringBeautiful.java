// Last updated: 6/12/2026, 11:16:49 PM
1class Solution {
2    public int minChanges(String s) {
3        int ans = 0;
4        for(int i = 0; i < s.length(); i += 2) {
5            if(s.charAt(i) != s.charAt(i + 1))
6                ans++;
7        }
8        return ans;
9    }
10}