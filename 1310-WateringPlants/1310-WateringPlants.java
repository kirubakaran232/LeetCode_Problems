// Last updated: 5/25/2026, 7:16:08 PM
class Solution {
    public int wateringPlants(int[] p, int cap) {
        int tot = 0;
        int temp = cap;
        for(int i=0;i<p.length;i++){
            if(cap<p[i]){
                tot+=2*i;
                cap=temp;
            }
            cap-=p[i];
            tot+=1;
        }
        return tot;
    }
}