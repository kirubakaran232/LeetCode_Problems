// Last updated: 7/15/2026, 1:38:43 AM
1class Solution {
2    public int beautySum(String s) {
3        int ans = 0;
4        int n = s.length();
5        for (int i = 0; i < n; i++) {
6            int[] freq = new int[26];
7            for (int j = i; j < n; j++) {
8                freq[s.charAt(j) - 'a']++;                
9                int max = 0;
10                int min = Integer.MAX_VALUE;
11                for (int k = 0; k < 26; k++) {
12                    if (freq[k] > 0) {
13                        max = Math.max(max, freq[k]);
14                        min = Math.min(min, freq[k]);
15                    }
16                }
17                ans += (max - min);
18            }
19        }
20        return ans;
21    }
22}