// Last updated: 7/17/2026, 11:07:36 AM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        int sum = 0, max = 0;
4        Set<Integer> hs = new HashSet<>();
5        int l = 0;
6        for(int r=0;r<nums.length;r++){
7            while(hs.contains(nums[r])){
8                hs.remove(nums[l]);
9                sum-=nums[l];
10                l++;
11            }
12            hs.add(nums[r]);
13            sum+=nums[r];
14            max = Math.max(sum,max);
15        }
16        return max;
17    }
18}