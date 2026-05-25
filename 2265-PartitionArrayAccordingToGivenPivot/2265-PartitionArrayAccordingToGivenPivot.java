// Last updated: 5/25/2026, 7:12:02 PM
class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        int res[] = new int[arr.length];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                res[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==pivot){
                res[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>pivot){
                res[count]=arr[i];
                count++;
            }
        }
        return res;
    }
}


