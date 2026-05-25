# Last updated: 5/25/2026, 7:06:55 PM
class Solution:
    def canMakeEqual(self, nums: List[int], k: int) -> bool:
        def min_ops_to_make_all(target: int) -> int:
            temp = nums[:]
            ops = 0
            for i in range(len(temp) - 1):
                if temp[i] != target:
                    # Flip temp[i] and temp[i+1]
                    temp[i] *= -1
                    temp[i+1] *= -1
                    ops += 1
            # Check if last element matches target
            if temp[-1] != target:
                return float('inf')  # can't fix it
            return ops

        return min(min_ops_to_make_all(1), min_ops_to_make_all(-1)) <= k
