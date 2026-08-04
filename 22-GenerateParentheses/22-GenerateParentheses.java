// Last updated: 8/4/2026, 6:20:50 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<>();
4        bt(res,0,0,n,"");
5        return res;
6    }
7    public void bt(List<String> res,int op,int cl,int n,String s){
8        if(op==n && cl==n){
9            res.add(s);
10        }
11        if(op<n){
12            bt(res,op+1,cl,n,s+"(");
13        }
14        if(cl<op){
15            bt(res,op,cl+1,n,s+")");
16        }
17    }
18}