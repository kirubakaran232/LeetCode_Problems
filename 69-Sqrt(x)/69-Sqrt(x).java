// Last updated: 6/2/2026, 9:13:21 PM
1class Solution {
2    public int mySqrt(int x) {
3        if(x<2) return x;
4        int l = 1,r = x/2;
5        while(l<=r){
6            int mid = (l+r)/2;
7            long sq = (long) mid*mid;
8            if(sq == x){
9                return mid;
10            }else if(sq>x){
11                r = mid-1;
12            }else{
13                l = mid+1;
14            }
15        }
16        return r;
17    }
18}