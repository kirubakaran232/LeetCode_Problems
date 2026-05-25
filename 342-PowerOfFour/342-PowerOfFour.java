// Last updated: 5/25/2026, 7:19:46 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
}