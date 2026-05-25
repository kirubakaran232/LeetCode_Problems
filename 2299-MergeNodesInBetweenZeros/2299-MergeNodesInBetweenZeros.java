// Last updated: 5/25/2026, 7:11:45 PM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            ListNode nn = curr.next;
            int sum = 0;
            while(nn!=null && nn.val!=0){
                sum+=nn.val;
                nn=nn.next;
            }
            curr.val=sum;
            curr.next=nn;
            curr=curr.next;
        }
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}