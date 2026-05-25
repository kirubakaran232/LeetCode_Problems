// Last updated: 5/25/2026, 7:13:53 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int ca=0;
        int maxa=0;
        for(int i=0;i<gain.length;i++){
            ca+=gain[i];
            if(ca>maxa){
                maxa=ca;
            }
        }
        return maxa;
    }
}