// Last updated: 5/25/2026, 7:22:22 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            ListNode nn = curr.next;
            if(curr.val!=nn.val){
                curr=curr.next;
            }else{
                curr.next=nn.next;
            }
        }
        return head;
    }
}