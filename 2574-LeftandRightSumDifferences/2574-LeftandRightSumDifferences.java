// Last updated: 6/6/2026, 7:04:33 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int leftSum[] = new int[nums.length];
4        int rightSum[] = new int[nums.length];
5        int ans[] = new int[nums.length];
6        leftSum[0]=0;
7        for(int i=1;i<nums.length;i++){
8            leftSum[i]=leftSum[i-1]+nums[i-1];
9        }
10
11        rightSum[nums.length-1]=0;
12        for(int i=nums.length-2;i>=0;i--){
13            rightSum[i]=rightSum[i+1]+nums[i+1];
14        }
15
16        for(int i=0;i<nums.length;i++){
17            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
18        }
19        return ans;
20    }
21}