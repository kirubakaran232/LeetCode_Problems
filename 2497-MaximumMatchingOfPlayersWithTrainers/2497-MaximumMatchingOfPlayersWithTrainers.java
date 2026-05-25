// Last updated: 5/25/2026, 7:11:04 PM
class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int l = 0,r = 0;
         while (l < p.length && r < t.length) {
            if(p[l]<=t[r]){
                l++;
                r++;
            }else{
                r++;
            }
        }
        return l;
    }
}