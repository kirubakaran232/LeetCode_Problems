// Last updated: 5/25/2026, 7:09:43 PM
class Solution {
    public int sumOfSquares(int[] nums) {
        int sq = 0;
        int sum =0;
        int n= nums.length;
        int j=1;
        for(int i=0;i<n;i++){
            if(n%j==0){
                sq=nums[i]*nums[i];
                sum+=sq;
            }
            j++;
        }
        return sum;
    }
}