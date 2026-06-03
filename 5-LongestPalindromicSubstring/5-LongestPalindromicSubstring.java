// Last updated: 6/4/2026, 12:45:32 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        boolean dp[][] = new boolean[n][n];
5        int max = 0;
6        String res = "";
7        for(int i=0;i<n;i++){
8            dp[i][i]=true;
9            res = s.substring(i, i + 1);
10            max = 1;
11        }
12        for(int len=2;len<=n;len++){
13            for(int i=0;i<=n-len;i++){
14                int j = i+len-1;
15                if(s.charAt(i)==s.charAt(j)){
16                    if (len == 2 || dp[i + 1][j - 1]) {
17                        dp[i][j]=true;
18                        if(len>max){
19                            res = s.substring(i,j+1);
20                            max = len;
21                        }
22                    }
23                }
24            }
25        }
26        return res;
27    }
28}