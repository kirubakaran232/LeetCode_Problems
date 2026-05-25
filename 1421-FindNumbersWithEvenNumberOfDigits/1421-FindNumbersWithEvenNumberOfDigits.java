// Last updated: 5/25/2026, 7:15:51 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int len = String.valueOf(nums[i]).length();
            if(len%2==0){
                count++;
            }
        }
        return count;
    }
}