// Last updated: 7/17/2026, 10:13:37 AM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        int l = 0,res = 0,oc = 0,c = 0;
4        for(int r=0;r<nums.length;r++){
5            if(nums[r]%2!=0){
6                oc++;
7                c=0;
8            }
9            while(oc==k){
10                c++;
11                if(nums[l]%2!=0){
12                    oc--;
13                }
14                l++;
15            }
16            res+=c;
17        }
18        return res;
19    }
20}