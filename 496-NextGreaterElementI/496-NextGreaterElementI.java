// Last updated: 5/25/2026, 7:19:05 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int temp = j;
                    for(int k=temp;k<nums2.length;k++){
                        if(nums1[i]<nums2[k]){
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
            if(ans[i]==0) ans[i]=-1;
            
        }
        return ans;
    }
}