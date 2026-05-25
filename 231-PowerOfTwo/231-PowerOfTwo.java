// Last updated: 5/25/2026, 7:20:28 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 &&(n&(n-1))==0;
    }
}