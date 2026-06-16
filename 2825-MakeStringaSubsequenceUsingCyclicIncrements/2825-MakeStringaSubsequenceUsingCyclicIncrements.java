// Last updated: 6/16/2026, 9:54:05 AM
1class Solution {
2    public boolean canMakeSubsequence(String str1, String str2) {
3        int m = str1.length(),n = str2.length();
4        int j = 0;
5        for(int i=0;i<m && j<n;i++){
6            char c1 = str1.charAt(i),c2 = str2.charAt(j);
7            if(c1==c2 || c1+1 == c2 || c1-25 == c2){
8                j++;
9            }
10        }
11        return j == n;
12    }
13}