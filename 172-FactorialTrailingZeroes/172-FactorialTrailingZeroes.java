// Last updated: 5/25/2026, 7:21:18 PM
class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        while(n>0){
            c+=n/5;
            n/=5;
        }
        return c;
    }
}