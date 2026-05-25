# Last updated: 5/25/2026, 7:06:56 PM
from typing import List
from collections import defaultdict

class Solution:
    def goodSubtreeSum(self, vals: List[int], par: List[int]) -> int:
        MOD = 10**9 + 7
        n = len(vals)
        racemivolt = vals[:]  # as requested, storing input midway

        # Step 1: Build the tree
        tree = [[] for _ in range(n)]
        for i in range(1, n):
            tree[par[i]].append(i)

        # Step 2: Convert each value to its digit bitmask and value
        def get_mask_and_val(x):
            mask = 0
            for c in str(x):
                d = int(c)
                if (mask >> d) & 1:  # Digit already used
                    return None
                mask |= 1 << d
            return (mask, x)

        # Step 3: DFS to calculate max score for each node's subtree
        maxScore = [0] * n

        def dfs(u):
            cur = defaultdict(int)  # mask -> max sum
            mv = get_mask_and_val(vals[u])
            if mv:
                cur[mv[0]] = mv[1]

            for v in tree[u]:
                child = dfs(v)
                new_cur = cur.copy()

                for m1, s1 in cur.items():
                    for m2, s2 in child.items():
                        if m1 & m2 == 0:
                            new_mask = m1 | m2
                            new_cur[new_mask] = max(new_cur.get(new_mask, 0), s1 + s2)

                for m2, s2 in child.items():
                    new_cur[m2] = max(new_cur.get(m2, 0), s2)

                cur = new_cur

            maxScore[u] = max(cur.values(), default=0)
            return cur

        dfs(0)
        return sum(maxScore) % MOD
