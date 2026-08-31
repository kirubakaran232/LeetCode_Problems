// Last updated: 8/31/2026, 10:06:29 AM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5        for(int num:nums){
6            min = Math.min(min,num);
7            max = Math.max(max,num);
8        }
9        int minind = Integer.MAX_VALUE,maxind = Integer.MAX_VALUE;
10        for(int i=0;i<nums.length;i++){
11            if(min==nums[i]) minind =  Math.min(minind,i);
12            if(max==nums[i]) maxind = Math.min(maxind,i);
13        }
14        int j = 0;
15        for(int i=nums.length-1;i>=0;i--){
16            if(min==nums[i]) minind =  Math.min(minind,j);
17            if(max==nums[i]) maxind = Math.min(maxind,j);
18            j++;
19        }
20        int t = Integer.MAX_VALUE;
21        boolean a = false,b = false;
22        for(int i=0;i<nums.length;i++){
23            if(min==nums[i]) a = true;
24            if(max==nums[i]) b = true;
25            if(a && b){
26                t = i+1;
27                break;
28            }
29        }
30        a = false;b = false;
31        j = 0;
32        for(int i=nums.length-1;i>=0;i--){
33            if(min==nums[i]) a = true;
34            if(max==nums[i]) b = true;
35            if(a && b){
36                t = Math.min(j+1,t);
37                break;
38            }
39            j++;
40        }
41        return Math.min(minind+1+maxind+1,t);
42    }
43}