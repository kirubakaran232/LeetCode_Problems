// Last updated: 8/3/2026, 2:30:05 PM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        boolean b[] = new boolean[nums.length];
5        Arrays.sort(nums);
6        bt(res,new ArrayList<>(),nums,b,0);
7        return res;
8    }
9    void bt(List<List<Integer>> res,ArrayList<Integer> l,int nums[],boolean b[],int st){
10        if(!res.contains(l))
11        res.add(new ArrayList<>(l));
12        for(int i=st;i<nums.length;i++){
13            if(b[i]) continue;
14            l.add(nums[i]);
15            b[i] = true;
16            bt(res,l,nums,b,i+1);
17            l.remove(l.size()-1);
18            b[i] = false;
19        }
20    } 
21}