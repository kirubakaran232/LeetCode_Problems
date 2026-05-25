// Last updated: 5/25/2026, 7:07:42 PM
class Solution {
    public int smallestNumber(int n) {
        int x = n;
        while ((x & (x + 1)) != 0){
            x++;
        }
        return x;
    }
}