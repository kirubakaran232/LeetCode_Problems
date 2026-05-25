// Last updated: 5/25/2026, 7:06:26 PM
class Solution {
    public int mirrorDistance(int n) {
        int rev = rev(n);
        return Math.abs(n-rev);
    }
    public int rev(int n){
        int rev = 0;
        while(n!=0){
            int temp = n%10;
            rev = rev*10+temp;
            n=n/10;
        }
        return rev;
    }
}