# Last updated: 5/25/2026, 7:07:09 PM
from typing import List

class Solution:
    def checkEqualPartitions(self, nums: List[int], target: int) -> bool:
        total_product = 1
        for num in nums:
            total_product *= num
        
        if total_product != target * target:
            return False
        
        n = len(nums)
        
        def backtrack(start, current_product):
            if current_product == target:
                return True
            if current_product > target:
                return False
            for i in range(start, n):
                if backtrack(i + 1, current_product * nums[i]):
                    return True
            return False
        
        return backtrack(0, 1)