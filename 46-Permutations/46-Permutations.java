// Last updated: 5/29/2026, 3:17:53 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        backtrack(res,new ArrayList<>(),nums);
5        return res;
6    }
7    public void backtrack(List<List<Integer>> res,List<Integer> l,int nums[]){
8        if(l.size()==nums.length) res.add(new ArrayList<>(l));
9        else{
10            for(int i=0;i<nums.length;i++){
11                if(l.contains(nums[i])) continue;
12                l.add(nums[i]);
13                backtrack(res,l,nums);
14                l.remove(l.size()-1);
15            }
16        }
17    }
18}