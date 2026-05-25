// Last updated: 5/25/2026, 7:11:31 PM
class Solution {
    public int[] successfulPairs(int[] spe, int[] pot, long suc) {
        Arrays.sort(pot);
        int res[] = new int[spe.length];
        for(int i=0;i<spe.length;i++){
            int c = pot.length;
            int left = 0,right = pot.length-1;
            while(left<=right){
                int mid = left + (right - left) / 2;
                long mul = (long)spe[i]*pot[mid];
                if(mul>=suc){
                    c=mid;
                    right = mid - 1;
                }else if(mul<suc){
                    left=mid+1;
                }
            }
            res[i]=pot.length-c;
        }
        return res;
    }
}