// Last updated: 6/13/2026, 12:31:37 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length-1;
4        while(i>0 && nums[i-1]>=nums[i]){
5            i--;
6        }
7        if(i==0){
8            reverse(nums,i,nums.length-1);
9            return;
10        }
11        int j = nums.length-1;
12        while(nums[i-1]>=nums[j]){
13            j--;
14        }
15        swap(nums, i - 1, j);
16        reverse(nums, i, nums.length - 1);
17    }
18    public void swap(int nums[],int i,int j){
19        int temp = nums[i];
20        nums[i] = nums[j];
21        nums[j] = temp;
22    }
23    public void reverse(int nums[],int l,int r){
24        while(l<r){
25            int temp = nums[l];
26            nums[l] = nums[r];
27            nums[r] = temp;
28            l++;
29            r--;
30        }
31    }
32}