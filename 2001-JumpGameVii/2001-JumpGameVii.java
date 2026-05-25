// Last updated: 5/25/2026, 7:13:09 PM
class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(0) != '0' || s.charAt(n - 1) != '0')
            return false;
        boolean dp[] = new boolean[n];
        dp[0] = true;
        int st = 0, end = 0;
        for (int i = 0; i < n; i++) {
            if (!dp[i])
                continue;
            st = Math.max(end + 1, i + minJump);
            end = Math.min(i + maxJump, n - 1);
            for (int j = st; j <= end; j++) {
                if (s.charAt(j) == '0')
                    dp[j] = true;
            }
        }
        return dp[n - 1];
    }
}