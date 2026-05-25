# Last updated: 5/25/2026, 7:06:50 PM
from typing import List
from collections import defaultdict

class Solution:
    def maxSumDistinctTriplet(self, x: List[int], y: List[int]) -> int:
        max_y_for_x = defaultdict(int)

        # Step 1: Map each unique x to its max y
        for xi, yi in zip(x, y):
            max_y_for_x[xi] = max(max_y_for_x[xi], yi)

        # Step 2: Get top 3 y values for distinct x values
        if len(max_y_for_x) < 3:
            return -1

        top_y_values = sorted(max_y_for_x.values(), reverse=True)
        return sum(top_y_values[:3])
