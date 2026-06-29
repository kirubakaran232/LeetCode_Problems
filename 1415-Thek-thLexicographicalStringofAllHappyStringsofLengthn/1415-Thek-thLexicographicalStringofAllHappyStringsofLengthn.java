// Last updated: 6/29/2026, 11:53:16 AM
1class Solution {
2    public String getHappyString(int n, int k) {
3        ArrayList<String> l = new ArrayList<>();
4        String str = "abc";
5        bt(n,l,"",str);
6        if (k > l.size()) return "";
7        return l.get(k-1);
8    }
9    static void bt(int n,ArrayList<String> l,String s,String str){
10        if(s.length()==n){
11            l.add(s);
12            return;
13        }
14        for(int i=0;i<3;i++){
15            if(s.length()>0 && s.charAt(s.length()-1)==str.charAt(i)) continue;
16            bt(n,l,s+str.charAt(i),str);
17        }
18    }
19}