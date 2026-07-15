// Last updated: 7/15/2026, 9:04:01 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int even = 0,odd = 0;
4        for(int i=1;i<=n*2;i++){
5            if(i%2==0){
6                even+=i;
7            }else{
8                odd+=i;
9            }
10        }
11        int min = Math.min(even,odd);
12        int res = 0;
13        for(int i=1;i<=min;i++){
14            if(even%i==0 && odd%i==0){
15                res = i;
16            }
17        }
18        return res;
19    }
20}