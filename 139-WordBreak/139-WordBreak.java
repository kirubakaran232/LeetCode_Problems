// Last updated: 6/1/2026, 12:28:48 PM
1class Solution {
2    public boolean wordBreak(String s, List<String> w) {
3        boolean dp[] = new boolean[s.length()+1];
4        dp[0] = true;
5        Set<String> hs = new HashSet<>(w);
6        for(int i=1;i<=s.length();i++){
7            for(int j=0;j<i;j++){
8                if(dp[j] && w.contains(s.substring(j,i))){
9                    dp[i] = true;
10                }
11            }
12        }
13        return dp[s.length()];
14    }
15}