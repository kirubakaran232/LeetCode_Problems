// Last updated: 5/29/2026, 3:18:16 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> l = new ArrayList<>();
5        backtrack(1,res,l,n,k);
6        return res;
7    }
8    public void backtrack(int st,List<List<Integer>> res,List<Integer> l,int n,int k){
9        if(l.size()==k){
10            res.add(new ArrayList<>(l));
11            return;
12        }
13        for(int i=st;i<=n;i++){
14            l.add(i);
15            backtrack(i+1,res,l,n,k);
16            l.remove(l.size()-1);
17        }
18    }
19}