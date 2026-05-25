// Last updated: 5/25/2026, 7:18:40 PM
// class Solution {
//     public int findLHS(int[] nums) {
//         Arrays.sort(nums);
//         int min = 0,left=0,len=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]-nums[left]>1){
//                 left++;
//             }
//             if(nums[i]-nums[left]==1){
//                 len = Math.max(len,i-left+1);
//             }
//         }
//         return len;
//     }
// }
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0,len=0,max=0;
        for(int right=1;right<nums.length;right++){
            if(nums[right]-nums[left]==1){
                len=right-left+1;
            }
            if(len>max){
                max=len;
            }
            while(nums[right]-nums[left]>1&&left<right){
                left++;
            }
        }
        return max;
    }
}