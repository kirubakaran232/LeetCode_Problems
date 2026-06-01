// Last updated: 6/1/2026, 10:37:05 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> hs = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            hs.add(nums[i]);
6        }
7        int len = 0,curr = 0,res = 0;
8        for(int num:hs){
9            if(!hs.contains(num-1)){
10                len = 1;
11                curr = num;
12                while(hs.contains(curr+1)){
13                    len++;
14                    curr++;
15                }
16                res = Math.max(res,len);
17            }
18        }
19        return res;
20    }
21}