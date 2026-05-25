// Last updated: 5/25/2026, 7:16:32 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        int last=-1;
        for(int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i]=last;
            last=Math.max(last,temp);
        }
        return arr;
    }
}