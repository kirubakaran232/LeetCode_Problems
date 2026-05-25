// Last updated: 5/25/2026, 7:17:49 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1,right = arr.length-1,mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return 0;
    }
}