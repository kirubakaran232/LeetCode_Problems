// Last updated: 5/27/2026, 7:37:14 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> q = new PriorityQueue<>();
4        for(int num : nums){
5            q.add(num);
6            if(q.size() > k){
7                q.remove();
8            }
9        }
10        return q.remove();
11    }
12}