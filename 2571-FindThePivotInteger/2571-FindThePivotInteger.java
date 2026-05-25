// Last updated: 5/25/2026, 7:10:45 PM
class Solution {
    public int pivotInteger(int n) {
        int total_sum=0;
        for(int i=0;i<=n;i++){
            total_sum+=i;
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum==total_sum-sum+i){
                return i;
            }
        }
        return -1;
    }
}