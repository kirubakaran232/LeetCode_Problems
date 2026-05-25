// Last updated: 5/25/2026, 7:11:09 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        int m = Integer.MAX_VALUE;
        for(int i=1;i<=m;i++){
            if(i%2==0 && i%n==0){
                return i;
            }
        }
        return 0;
    }
}