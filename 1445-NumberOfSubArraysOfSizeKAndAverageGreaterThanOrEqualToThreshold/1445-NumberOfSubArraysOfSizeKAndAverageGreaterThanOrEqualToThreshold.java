// Last updated: 5/25/2026, 7:15:43 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum = 0;
        int n = arr.length,count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold) count++;
        for(int i=1;i<n-k+1;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            if(sum/k>=threshold) count++;
        }
        return count;
    }
}