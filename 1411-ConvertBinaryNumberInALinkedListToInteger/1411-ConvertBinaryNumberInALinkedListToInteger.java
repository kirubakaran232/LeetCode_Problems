// Last updated: 5/25/2026, 7:15:53 PM
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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int res = 0;
        while(curr!=null){
            res=res*2+curr.val;
            curr=curr.next;
        }
        return res;
    }
}