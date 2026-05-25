// Last updated: 5/25/2026, 7:07:53 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                arr[k++]=nums[i];
            }
        }
   return arr; }
}