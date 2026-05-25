// Last updated: 5/25/2026, 7:10:40 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0){
            n=n/2;
            return n;
        }
        return n;
    }
}