// Last updated: 5/25/2026, 7:16:35 PM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int diff[] = new int[n];
        for(int b[] :bookings){
            int f = b[0]-1;
            int l = b[1]-1;
            int s = b[2];
            diff[f]+=s;
            if(l+1<n){
                diff[l+1]-=s;
            }
        }
        int pre[] = new int[n];
        pre[0] = diff[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+diff[i];
        }
        return pre;
    }
}