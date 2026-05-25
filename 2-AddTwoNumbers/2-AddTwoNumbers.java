// Last updated: 5/25/2026, 7:23:58 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int tot = 0, car = 0;
        while(l1!=null || l2!=null || car!=0){
            tot = car;
            if(l1!=null){
                tot+=l1.val;
                l1 = l1.next; 
            }if(l2!=null){
                tot+=l2.val;
                l2 = l2.next; 
            }
            int sum = tot%10;
            car = tot/10;
            dummy.next = new ListNode(sum);
            dummy = dummy.next;
        }
        return res.next;
    }
}