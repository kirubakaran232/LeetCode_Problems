// Last updated: 8/22/2026, 8:53:15 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum = 0;
4        int pro = 1;
5        int og = n;
6        while(n>0){
7            int temp = n%10;
8            sum+=temp;
9            pro*=temp;
10            n/=10;
11        }
12        return (og%(sum+pro)==0);
13    }
14}