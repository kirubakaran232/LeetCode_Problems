// Last updated: 7/31/2026, 2:18:53 PM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res = new ArrayList<>();
4        bt(res,new ArrayList<>(),1,k,n);
5        return res;
6    }
7    public void bt(List<List<Integer>> res, List<Integer> l,int st,int k,int n){
8        if(l.size()==k){
9            res.add(new ArrayList<>(l));
10            return;
11        }
12        for(int i=st;i<=n;i++){
13            if(l.contains(i)) continue;
14            l.add(i);
15            bt(res,l,i+1,k,n);
16            l.remove(l.size()-1);
17        }
18    }
19}