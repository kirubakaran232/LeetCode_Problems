// Last updated: 8/28/2026, 12:12:42 PM
1class Solution {
2    public int minimumLength(String s) {
3        int l = 0,r = s.length()-1;
4        while(l<r){
5            if(s.charAt(l)!=s.charAt(r)) break;
6            if(s.charAt(l)==s.charAt(r)){
7                char ch = s.charAt(l);
8                while(l<=r && s.charAt(l)==ch){
9                    l++;
10                }
11                while(l<=r && s.charAt(r)==ch){
12                    r--;
13                }
14            }
15        }
16        return r-l+1;
17    }
18}