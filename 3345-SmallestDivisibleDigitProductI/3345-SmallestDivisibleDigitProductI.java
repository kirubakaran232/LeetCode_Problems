// Last updated: 8/6/2026, 11:58:53 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int d = 1,og = n;
4        boolean b = true;
5        while(b){
6            n = og;
7            d = 1;
8            while(n>0){
9                int temp = n%10;
10                d*=temp;
11                n/=10;
12            }
13            if(d%t==0) return og;
14            og++;
15        }
16        
17        return 0;
18    }
19}