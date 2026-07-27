// Last updated: 7/27/2026, 9:21:08 PM
1class Solution {
2    public int maxArea(int[] h) {
3        int l = 0,r = h.length-1;
4        int area = 0;
5        while(l<r){
6            int ht = Math.min(h[l],h[r]);
7            int w = r-l;
8            if(h[l]<h[r]){
9                area = Math.max(area,ht*w);
10                l++;
11            }else{
12                area = Math.max(area,ht*w);
13                r--;
14            }
15        }
16        return area;
17    }
18}