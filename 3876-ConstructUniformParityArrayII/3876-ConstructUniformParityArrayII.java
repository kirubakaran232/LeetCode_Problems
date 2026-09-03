// Last updated: 9/3/2026, 8:55:04 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int min = Integer.MAX_VALUE;
4        for(int i=0;i<nums1.length;i++){
5            min = Math.min(min,nums1[i]);
6        }
7        if(min%2!=0) return true;
8        for(int num:nums1){
9            if(num%2!=0) return false;
10        }
11        return true;
12    }
13}