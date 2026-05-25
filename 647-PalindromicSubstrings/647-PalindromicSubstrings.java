// Last updated: 5/25/2026, 7:18:27 PM
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 
                if (isPalindrome(s, i, j)) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
