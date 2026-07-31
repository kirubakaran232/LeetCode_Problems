// Last updated: 7/31/2026, 3:46:17 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] c, int k) {
3        List<List<Integer>> res = new ArrayList<>();
4        bt(res,new ArrayList<>(),c,k,0,0);
5        return res;
6    }
7    public void bt(List<List<Integer>> res,List<Integer> l,int[] c,int k,int sum,int s){
8        if(sum==k){
9            res.add(new ArrayList<>(l));
10            s++;
11            return;
12        }
13        else if(sum>k) return;
14        for(int i=s;i<c.length;i++){
15            l.add(c[i]);
16            sum+=c[i];
17            bt(res,l,c,k,sum,i);
18            l.remove(l.size()-1);
19            sum-=c[i];
20        }
21    }
22}