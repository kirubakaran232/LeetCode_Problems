// Last updated: 8/7/2026, 11:11:21 AM
1class Solution {
2    public boolean checkValidString(String str) {
3        Stack<Integer> p = new Stack<>();
4        Stack<Integer> s = new Stack<>();
5        for(int i=0;i<str.length();i++){
6            char ch = str.charAt(i);
7            if(ch=='(') p.push(i);
8            else if(ch=='*') s.push(i);
9            else{
10                if(!p.isEmpty()) p.pop();
11                else if(!s.isEmpty()) s.pop();
12                else return false;
13            }
14        }
15        while(!p.isEmpty() && !s.isEmpty()){
16            int pi = p.pop();
17            int si = s.pop();
18            if(si<pi) return false;
19        }
20        return p.isEmpty();
21    }
22}