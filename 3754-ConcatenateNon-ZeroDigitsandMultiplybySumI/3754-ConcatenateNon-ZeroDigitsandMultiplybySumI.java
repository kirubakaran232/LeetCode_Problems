// Last updated: 7/7/2026, 9:26:33 AM
1class Solution {
2    public long sumAndMultiply(int n) {
3        long ans = 0,sum = 0,p = 0;
4        while(n>0){
5            int temp = n%10;
6            if(temp!=0){
7                ans = temp*(int)Math.pow(10,p)+ans;
8                sum+=temp;
9                p++;
10            }
11            n/=10;
12        }
13        return ans*sum;
14    }
15}