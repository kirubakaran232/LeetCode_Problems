// Last updated: 5/25/2026, 7:23:54 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        int ind = 0;
        for(int i=nums1.length;i<arr.length;i++){
            arr[i] = nums2[ind];
            ind++;
        }
        Arrays.sort(arr);
        int mid = arr.length/2;
        if((arr.length & 1) != 0){
            return (float) arr[mid];
        }
        else{
            return (arr[mid] + arr[mid -1]) / 2.0;
        }
    }
}