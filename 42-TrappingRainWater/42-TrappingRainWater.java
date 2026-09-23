// Last updated: 9/23/2026, 8:31:36 PM
1class Solution {
2    public int trap(int[] h) {
3        int l = 0,r = h.length-1;
4        int lmax = h[l], rmax = h[r];
5        int w = 0;
6        while(l<r){
7            if(lmax<rmax){
8                l++;
9                lmax = Math.max(lmax,h[l]);
10                w += lmax - h[l];
11            }else{
12                r--;
13                rmax = Math.max(rmax,h[r]);
14                w += rmax - h[r];
15            }
16        }
17        return w;
18    }
19}