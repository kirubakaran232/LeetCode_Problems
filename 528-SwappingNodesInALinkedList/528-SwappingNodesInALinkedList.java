// Last updated: 5/25/2026, 7:18:52 PM
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode st = head;
        ListNode end = head;
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        for(int i=0;i<len-k;i++){
            end=end.next;
        }
        int sc = 0;
        while(sc<k-1){
            st=st.next;
            sc++;
        }
        int temp = st.val;
        st.val = end.val;
        end.val = temp;
        return head;
    }
}