// Last updated: 6/28/2026, 8:09:00 PM
1class Solution {
2    public String convertToTitle(int n) {
3        StringBuilder str = new StringBuilder();
4        while (n > 0) {
5            n--;
6            str.append((char)('A' + (n % 26)));
7            n /= 26;
8        }
9        return str.reverse().toString();
10    }
11}