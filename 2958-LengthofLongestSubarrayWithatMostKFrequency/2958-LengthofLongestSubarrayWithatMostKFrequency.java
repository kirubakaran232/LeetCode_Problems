// Last updated: 8/12/2026, 9:16:41 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        HashMap<Integer,Integer> hm = new HashMap<>();
4        int l = 0, len = 0,max = 0;
5        for(int r=0;r<nums.length;r++){
6            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
7            while(hm.get(nums[r])>k){
8                hm.put(nums[l],hm.get(nums[l])-1);
9                l++;
10            }
11            len = r-l+1;
12            max = Math.max(max,len);
13        }
14        return max;
15    }
16}