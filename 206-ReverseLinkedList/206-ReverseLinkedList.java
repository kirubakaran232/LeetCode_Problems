// Last updated: 5/25/2026, 7:20:50 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextnode = curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextnode;
        }
        return pre;
    }
}