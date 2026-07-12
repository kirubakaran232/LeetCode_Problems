// Last updated: 7/12/2026, 11:25:43 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int rank = 1;
4        int[] nums = arr.clone();
5        Arrays.sort(nums);
6        HashMap<Integer,Integer> hm = new HashMap<>();
7        for(int i=0;i<arr.length;i++){
8            if(!hm.containsKey(nums[i])){
9                hm.put(nums[i],rank++);
10            }
11        }
12        for(int i=0;i<arr.length;i++){
13            arr[i] = hm.get(arr[i]);
14        }
15        return arr;
16    }
17}