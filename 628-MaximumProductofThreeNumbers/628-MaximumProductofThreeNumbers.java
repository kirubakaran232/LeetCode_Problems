// Last updated: 7/26/2026, 11:38:27 PM
1// class Solution {
2//     public int maximumProduct(int[] nums) {
3//         int max=1;
4// int ans=1; 
5// Arrays.sort(nums);
6//         for(int i=0;i<3;i++)
7//         {
8//            ans*= nums[i];
9//         }
10//         max=ans;
11// int r= 0;
12
13//         for(int i=3;i<nums.length;i++)
14//         {
15//              ans=ans/nums[r];
16//              ans*=nums[i];
17//              r++;
18//              max=Math.max(max,ans);
19//         }
20//        return max;
21//     }
22//  }
23class Solution {
24    public int maximumProduct(int[] nums) {
25        Arrays.sort(nums);
26        int n = nums.length;
27        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
28    }
29}