// Last updated: 5/25/2026, 7:12:54 PM
class Solution {
    public boolean isThree(int n) {
        if(n==1){
            return false;
        }
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt==3;
    }
}