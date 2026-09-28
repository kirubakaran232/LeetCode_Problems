// Last updated: 9/28/2026, 12:00:20 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> res = new ArrayList<>();
4        bt(0,s,new ArrayList<>(),res);
5        return res;
6    }
7    public void bt(int st,String s,ArrayList<String> l,List<List<String>> res){
8        if(st==s.length()){
9            res.add(new ArrayList<>(l));
10            return;
11        }
12        for(int ed=st;ed<s.length();ed++){
13            String str = s.substring(st,ed+1);
14            if(isP(str)){
15                l.add(str);
16                bt(ed+1,s,l,res);
17                l.remove(l.size()-1);
18            }
19        }
20    }
21    public boolean isP(String s){
22        int l = 0,r = s.length()-1;
23        while(l<r){
24            if(s.charAt(l)!=s.charAt(r)){
25                return false;
26            }
27            l++;
28            r--;
29        }
30        return true;
31    }
32}