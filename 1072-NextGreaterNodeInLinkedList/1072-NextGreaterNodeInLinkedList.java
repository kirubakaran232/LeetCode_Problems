// Last updated: 5/25/2026, 7:17:00 PM
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
    public int[] nextLargerNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        HashMap<ListNode,Integer> hs=new HashMap<>();
        ListNode curr=head,x=null;
        int n=0;
        while(curr!=null){
            if(st.empty()){
                st.push(curr);
            }else{
                while(!st.empty() && curr.val > st.peek().val){
                x=st.pop();
                hs.put(x,curr.val);
            }
            st.push(curr);
            curr=curr.next;
            n++;
            }
            
        }
        while(!st.empty()){
            hs.put(st.pop(),0);
        }
        int arr[]=new int[n];
        curr=head;
        int i=0;
        while(curr!=null){
            arr[i]=hs.get(curr);
            curr=curr.next;
            i++;
        }
          
        return arr;
        
    }
}