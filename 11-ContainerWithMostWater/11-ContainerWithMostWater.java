// Last updated: 5/25/2026, 7:23:46 PM
class Solution {
    public int maxArea(int[] h) {
        int l = 0,r = h.length-1;
        int area = 0;
        while(l<r){
            if(h[l]<h[r]){
                int ht = Math.min(h[l],h[r]);
                int w = r-l;
                area = Math.max(area,ht*w);
                l++;
            }else{
                int ht = Math.min(h[l],h[r]);
                int w = r-l;
                area = Math.max(area,ht*w);
                r--;
            }
        }
        return area;
    }
}