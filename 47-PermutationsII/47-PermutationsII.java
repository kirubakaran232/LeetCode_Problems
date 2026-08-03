// Last updated: 8/3/2026, 2:17:15 PM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5        boolean[] b = new boolean[nums.length];
6        bt(res,new ArrayList<>(),nums,b);
7        return res;
8    }
9    public void bt(List<List<Integer>> res, ArrayList<Integer> l,int[] nums,boolean b[]){
10        if(nums.length==l.size()){
11            res.add(new ArrayList<>(l));
12            return;
13        }
14        for(int i=0;i<nums.length;i++){
15            if(b[i]) continue;
16            if(i>0 && nums[i]==nums[i-1] && !b[i-1]) continue;
17            l.add(nums[i]);
18            b[i] = true;
19            bt(res,l,nums,b);
20            l.remove(l.size()-1);
21            b[i] = false;
22        }
23    }
24}