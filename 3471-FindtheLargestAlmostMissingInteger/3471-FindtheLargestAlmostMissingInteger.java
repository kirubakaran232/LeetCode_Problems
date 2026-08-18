// Last updated: 8/18/2026, 2:06:46 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        Map<Integer,Integer> hm = new HashMap<>();
4        int l = 0,r = nums.length;
5        int max = -1;
6        while(l<=r-k){
7            Set<Integer> hs = new HashSet<>();
8            for(int i=l;i<k+l;i++){
9                if(hs.contains(nums[i])) continue;
10                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
11                hs.add(nums[i]);
12            }
13            l++;
14        }
15        for(Map.Entry<Integer, Integer> i : hm.entrySet()) {
16            if(i.getValue() == 1)
17                max = Math.max(i.getKey(),max);
18        }
19        return max;
20    }
21}