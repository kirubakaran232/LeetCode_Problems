// Last updated: 7/28/2026, 2:26:02 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int[] freq = new int[26];
4        for (char c : s.toCharArray()) {
5            freq[c - 'a']++;
6        }
7
8        StringBuilder left = new StringBuilder();
9        String mid = "";
10
11        for (int i = 0; i < 26; i++) {
12            for (int j = 0; j < freq[i] / 2; j++) {
13                left.append((char) ('a' + i));
14            }
15
16            if (freq[i] % 2 == 1) {
17                mid = String.valueOf((char) ('a' + i));
18            }
19        }
20
21        String right = new StringBuilder(left).reverse().toString();
22        return left.toString() + mid + right;
23    }
24}