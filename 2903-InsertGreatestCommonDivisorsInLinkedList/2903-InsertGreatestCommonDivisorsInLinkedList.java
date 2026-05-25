// Last updated: 5/25/2026, 7:09:29 PM
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
    int findgcd(int a, int b) {
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    ListNode insertNode(int a, int b, ListNode temp) {
        ListNode node = new ListNode();
        node.val = findgcd(a, b);
        node.next = temp.next;
        temp.next = node;
        // temp = temp.next.next;
        temp = temp.next.next;
        return temp;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null) {
            temp = insertNode(temp.val, temp.next.val, temp);
        }
        return head;
    }
}