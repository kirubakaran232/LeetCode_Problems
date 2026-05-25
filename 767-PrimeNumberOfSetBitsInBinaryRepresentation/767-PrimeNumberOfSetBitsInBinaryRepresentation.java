// Last updated: 5/25/2026, 7:18:03 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0,count=0;
        for(int i=left;i<=right;i++){
            c=Integer.bitCount(i^0);
            if(c==2||c==3||c==5||c==7||c==11||c==13||c==17||c==19||c==23||c==31){
                count++;
            }
        }
        return count;
    }
}