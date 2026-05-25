// Last updated: 5/25/2026, 7:18:20 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int m=n^(n>>1);
        return (m&(m+1))==0;
    }
}