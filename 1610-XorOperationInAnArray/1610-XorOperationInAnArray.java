// Last updated: 5/25/2026, 7:14:49 PM
class Solution {
    public int xorOperation(int n, int start) {
        int xor =0;
        for(int i=0;i<n;i++){
            int num = start + 2 * i;
            xor^=num;
        }
        return xor;
    }
}