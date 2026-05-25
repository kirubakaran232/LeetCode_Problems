// Last updated: 5/25/2026, 7:16:07 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int ecount =0,ocount=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0) ecount++;
            if(position[i]%2!=0) ocount++;
        }
        return Math.min(ecount,ocount);
    }
}