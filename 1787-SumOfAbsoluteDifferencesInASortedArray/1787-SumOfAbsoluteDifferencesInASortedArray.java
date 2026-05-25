// Last updated: 5/25/2026, 7:14:09 PM
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int pref[]=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int pre=Math.abs(pref[i]-(i+1)*nums[i]);
            int post=pref[n-1]-pref[i];
            post-=(n-1-i)*nums[i];
            arr[i]=pre+post;
        }
        return arr;
    }
}