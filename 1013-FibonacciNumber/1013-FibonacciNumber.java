// Last updated: 5/25/2026, 7:17:19 PM
class Solution {
    public int fib(int n) {
        for(int i=0;i<n;i++){
        if(n==1||n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
        }
        return 0;
    }
}