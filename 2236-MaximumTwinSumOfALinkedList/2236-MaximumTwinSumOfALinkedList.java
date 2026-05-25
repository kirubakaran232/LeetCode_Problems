// Last updated: 5/25/2026, 7:12:10 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode curr = head;
        List<Integer> l = new ArrayList<>();
        while(curr!=null){
            l.add(curr.val);
            curr=curr.next;
        }
        int max = 0;
        for(int i=0;i<(l.size()/2);i++){
            int sum = 0;
            sum+=l.get(i)+l.get(l.size()-1-i);
            max=Math.max(max,sum);
        }
        return max;
    }
}