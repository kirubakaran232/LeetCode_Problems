// Last updated: 8/4/2026, 2:24:33 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Arrays.sort(nums);
4        Set<Integer> hs = new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            hs.add(nums[i]);
7        }
8        List<Integer> l = new ArrayList<>();
9        for(int i=nums[0];i<=nums[nums.length-1];i++){
10            if(!hs.contains(i)){
11                l.add(i);
12            }
13        }
14        return l;
15    }
16}