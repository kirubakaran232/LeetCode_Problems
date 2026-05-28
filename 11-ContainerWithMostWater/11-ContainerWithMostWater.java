// Last updated: 5/29/2026, 3:17:04 AM
1class Solution {
2    public int maxArea(int[] h) {
3        int l = 0,r = h.length-1;
4        int area = 0;
5        while(l<r){
6            if(h[l]<h[r]){
7                int ht = Math.min(h[l],h[r]);
8                int w = r-l;
9                area = Math.max(area,ht*w);
10                l++;
11            }else{
12                int ht = Math.min(h[l],h[r]);
13                int w = r-l;
14                area = Math.max(area,ht*w);
15                r--;
16            }
17        }
18        return area;
19    }
20}