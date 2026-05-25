// Last updated: 5/25/2026, 7:23:29 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        ListNode tail = head;
        for(int i=0;i<k;i++){
            if(tail==null) return head;
            tail=tail.next;
        }
        ListNode newnode = reverse(head,tail);
        head.next = reverseKGroup(tail,k);
        return newnode;
    }
    public ListNode reverse(ListNode curr,ListNode tail){
        ListNode prev = null;
        while(curr!=tail && curr!=null){
            ListNode nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr=nn;
        }
        return prev;
    }
}