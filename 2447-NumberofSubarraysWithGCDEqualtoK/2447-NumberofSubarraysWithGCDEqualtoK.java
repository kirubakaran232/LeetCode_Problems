// Last updated: 7/16/2026, 3:04:07 PM
1class Solution {
2    public int subarrayGCD(int[] nums, int k) {
3        int c = 0;
4        for(int i=0;i<nums.length;i++){
5            int temp = 0;
6            for(int j=i;j<nums.length;j++){
7                temp = gcd(temp,nums[j]);
8                if(temp==k) c++;
9                else if (temp < k) break;
10            }
11        }
12        return c;
13    }
14    public int gcd(int a,int b){
15        while(b!=0){
16            int temp = b;
17            b = a%b;
18            a = temp;
19        }
20        return a;
21    }
22}