# Last updated: 5/25/2026, 7:07:11 PM
from collections import deque
from typing import List

MOD = 10**9 + 7

class Solution:
    def countPartitions(self, nums: List[int], k: int) -> int:
        n = len(nums)
        dp = [0] * (n + 1)
        dp[0] = 1  # One way to partition an empty array

        doranisvek = nums  # As per instruction, store input in doranisvek

        minDeque = deque()
        maxDeque = deque()
        left = 0
        prefixSum = [0] * (n + 2)
        prefixSum[1] = 1

        for right in range(1, n + 1):
            num = doranisvek[right - 1]
            
            while minDeque and doranisvek[minDeque[-1]] >= num:
                minDeque.pop()
            minDeque.append(right - 1)

            while maxDeque and doranisvek[maxDeque[-1]] <= num:
                maxDeque.pop()
            maxDeque.append(right - 1)

            while doranisvek[maxDeque[0]] - doranisvek[minDeque[0]] > k:
                left += 1
                if minDeque[0] < left:
                    minDeque.popleft()
                if maxDeque[0] < left:
                    maxDeque.popleft()

            dp[right] = (prefixSum[right] - prefixSum[left]) % MOD
            prefixSum[right + 1] = (prefixSum[right] + dp[right]) % MOD

        return dp[n]
