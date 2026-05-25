# Last updated: 5/25/2026, 7:06:53 PM
class Solution(object):
    def minCuttingCost(self, n, m, k):
        """
        :type n: int
        :type m: int
        :type k: int
        :rtype: int
        """
        import sys
        min_cost = sys.maxsize

        def best_single_cut(x):
            best = sys.maxsize
            for i in range(1, x):
                a, b = i, x - i
                if a <= k and b <= k:
                    best = min(best, a * b)
            return best if best != sys.maxsize else None

        # Case 1: Both n and m ≤ k — no cuts needed, just split one log
        if n <= k and m <= k:
            return 0

        # Case 2: One log > k, other ≤ k — only cut the longer one
        if n > k and m <= k:
            cost = best_single_cut(n)
            return cost if cost is not None else 0

        if m > k and n <= k:
            cost = best_single_cut(m)
            return cost if cost is not None else 0

        # Case 3: Both logs > k — need to cut both and choose best 3 of 4 logs
        for i in range(1, n):
            a, b = i, n - i
            if a > k or b > k:
                continue
            for j in range(1, m):
                c, d = j, m - j
                if c > k or d > k:
                    continue
                logs = [a, b, c, d]
                logs.sort()
                if logs[2] <= k:  # Top 3 all fit
                    cost = a * b + c * d
                    min_cost = min(min_cost, cost)

        return min_cost if min_cost != sys.maxsize else 0
