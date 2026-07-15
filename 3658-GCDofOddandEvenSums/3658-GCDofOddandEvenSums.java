// Last updated: 7/15/2026, 9:19:31 AM
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
12        int max = Math.max(even,odd);
13        while(min!=0){
14            int temp = min;
15            min = max%min;
16            max = temp;
17        }
18        return max;
19    }
20}