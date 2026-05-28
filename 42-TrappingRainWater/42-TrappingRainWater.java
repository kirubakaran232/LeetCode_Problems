// Last updated: 5/29/2026, 3:16:37 AM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int[] leftMax = new int[n];
5        int[] rightMax = new int[n];
6        leftMax[0] = height[0];
7        for(int i = 1; i < n; i++){
8            leftMax[i] = Math.max(leftMax[i-1], height[i]);
9        }
10        rightMax[n-1] = height[n-1];
11        for(int i = n-2; i >= 0; i--){
12            rightMax[i] = Math.max(rightMax[i+1], height[i]);
13        }
14        int water = 0;
15        for(int i = 0; i < n; i++){
16            water += Math.min(leftMax[i], rightMax[i]) - height[i];
17        }
18        return water;
19    }
20}