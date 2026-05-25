// Last updated: 5/25/2026, 7:15:56 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int pro =1,sum=1;;
        while(n>0){
            int digit=n%10;
            pro *= digit;
            sum += digit;
            n=n/10;
        }
        int res =pro-sum+1;
        return res;
    }
}