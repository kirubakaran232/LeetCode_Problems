// Last updated: 5/25/2026, 7:12:56 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        } 
        return arr;      
    }
}