// Last updated: 5/25/2026, 7:17:36 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int j=1,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[k]=nums[i];
                k++;
            }else{
                res[nums.length-j]=nums[i];
                j++;
            }
        }
        return res;
    }
}