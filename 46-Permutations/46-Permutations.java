// Last updated: 7/31/2026, 2:28:16 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        bt(res,new ArrayList<>(),nums);
5        return res;
6    }
7    public void bt(List<List<Integer>> res,List<Integer> l,int[] nums){
8        if(l.size()==nums.length){
9            res.add(new ArrayList<>(l));
10            return;
11        }
12        for(int i=0;i<nums.length;i++){
13            if(l.contains(nums[i])) continue;
14            l.add(nums[i]);
15            bt(res,l,nums);
16            l.remove(l.size()-1);
17        }
18    }
19}