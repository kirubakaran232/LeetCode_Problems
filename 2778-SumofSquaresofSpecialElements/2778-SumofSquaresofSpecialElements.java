// Last updated: 10/11/2026, 8:47:08 AM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int sq = 0;
4        int sum =0;
5        int n= nums.length;
6        int j=1;
7        for(int i=0;i<n;i++){
8            if(n%j==0){
9                sq=nums[i]*nums[i];
10                sum+=sq;
11            }
12            j++;
13        }
14        return sum;
15    }
16}