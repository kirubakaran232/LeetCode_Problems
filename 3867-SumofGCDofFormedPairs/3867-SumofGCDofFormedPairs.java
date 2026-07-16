// Last updated: 7/16/2026, 2:36:39 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int pre[] = new int[nums.length];
4        int mx = 0;
5        for(int i=0;i<pre.length;i++){
6            mx = Math.max(mx,nums[i]);
7            pre[i] = gcd(nums[i],mx);
8        }
9        Arrays.sort(pre);
10        long sum = 0;
11        int l = 0, r = pre.length-1;
12        while(l<r){
13            sum+=gcd(pre[l],pre[r]);
14            l++;
15            r--;
16        }
17        return sum;
18    }
19    public int gcd(int a,int b){
20        while(b!=0){
21            int temp = b;
22            b = a%b;
23            a = temp;
24        }
25        return a;
26    }
27}