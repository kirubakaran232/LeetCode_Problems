// Last updated: 5/25/2026, 7:08:02 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0,dsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                ssum+=nums[i];
            }
            if(nums[i]>=10){
                dsum+=nums[i];
            }
        }
        if(ssum>dsum||ssum<dsum){
            return true;
        }
        return false;
    }
}