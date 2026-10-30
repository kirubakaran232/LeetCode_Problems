// Last updated: 10/30/2026, 11:30:01 AM
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        long lmin = -1, lmax = -1, last = -1;
4        long c = 0;
5        for(int i = 0; i < nums.length; i++) {
6            if(nums[i] < minK || nums[i] > maxK) {
7                last = i;
8            }
9            if(nums[i] == minK) {
10                lmin = i;
11            }
12            if(nums[i] == maxK) {
13                lmax = i;
14            }
15            c += Math.max(0, Math.min(lmin, lmax) - last);
16        }
17        return c;
18    }
19}