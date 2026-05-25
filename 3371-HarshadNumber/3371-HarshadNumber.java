// Last updated: 5/25/2026, 7:08:37 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int og = x;
        int sum =0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        if(og%sum==0){
            return sum;
        }
        return -1;
    }
}