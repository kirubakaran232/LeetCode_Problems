// Last updated: 5/25/2026, 7:11:00 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int n = Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }

        return count;
    }
}