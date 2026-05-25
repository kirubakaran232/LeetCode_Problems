// Last updated: 5/25/2026, 7:15:19 PM
class Solution {
    public int findLucky(int[] arr) {
        int freq[] = new int[501];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=500;i>0;i--){
            if(i==freq[i]) return i;
        }
        return -1;
    }
}