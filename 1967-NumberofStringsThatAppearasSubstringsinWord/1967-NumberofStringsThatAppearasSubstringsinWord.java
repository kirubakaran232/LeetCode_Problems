// Last updated: 6/29/2026, 9:58:39 AM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int count = 0;
4        for (String p : patterns) {
5            if (word.contains(p)) {
6                count++;
7            }
8        }
9        return count;
10    }
11}