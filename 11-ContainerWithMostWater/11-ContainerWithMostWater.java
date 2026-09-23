// Last updated: 9/23/2026, 8:38:40 PM
1class Solution {
2    public int maxArea(int[] h) {
3        int l = 0,r = h.length-1;
4        int w = 0;
5        while(l<r){
6            int ht = Math.min(h[l],h[r]);
7            if(h[l]<h[r]){
8                l++;
9            }else{
10                r--;
11            }
12            w = Math.max(w,ht*(r-l+1));
13        }
14        return w;
15    }
16}