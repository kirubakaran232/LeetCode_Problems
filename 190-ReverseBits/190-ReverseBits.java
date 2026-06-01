// Last updated: 6/1/2026, 10:13:38 AM
1class Solution {
2    public int reverseBits(int n) {
3        int sum = 0;
4        for(int i=0;i<32;i++){
5            sum = sum<<1;
6            sum = sum + (n&1);
7            n=n>>1;
8        }
9        return sum;
10    }
11}