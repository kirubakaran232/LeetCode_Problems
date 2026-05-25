// Last updated: 5/25/2026, 7:21:07 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    public void rev(int[] nums,int st,int end){
        for(int i=st;i<end;i++){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}
