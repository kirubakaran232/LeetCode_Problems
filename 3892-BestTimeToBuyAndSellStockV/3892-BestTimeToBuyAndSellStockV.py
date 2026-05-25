# Last updated: 5/25/2026, 7:06:51 PM
from typing import List

class Solution:
    def maximumProfit(self, prices: List[int], k: int) -> int:
        n = len(prices)
        if n < 2 or k == 0:
            return 0

        dp = [[0] * n for _ in range(k + 1)]

        for t in range(1, k + 1):
            max_diff_normal = float('-inf')
            max_diff_short = float('-inf')

            for d in range(1, n):
                # For cooldown, we use dp[t-1][d-2] if d >= 2
                if d >= 2:
                    max_diff_normal = max(max_diff_normal, dp[t - 1][d - 2] - prices[d - 1])
                    max_diff_short = max(max_diff_short, dp[t - 1][d - 2] + prices[d - 1])
                elif d == 1:
                    # Special case for day 1, no cooldown possible
                    max_diff_normal = max(max_diff_normal, -prices[0])
                    max_diff_short = max(max_diff_short, prices[0])

                dp[t][d] = max(dp[t][d - 1], prices[d] + max_diff_normal, -prices[d] + max_diff_short)

        return dp[k][n - 1]
