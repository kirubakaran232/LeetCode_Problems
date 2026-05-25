// Last updated: 5/25/2026, 7:19:06 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0,c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                len = Math.max(len,c);
            }else{
                c = 0;
            }
        }
        return len;
    }
}