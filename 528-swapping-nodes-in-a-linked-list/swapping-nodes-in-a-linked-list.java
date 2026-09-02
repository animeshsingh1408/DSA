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
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;

        int c=k;

          while (c > 0) {
            fast = fast.next;
            c--;
        }
        while(fast!=null){
            
            slow=slow.next;
            fast=fast.next;
        }
        c=k;
        while(c>1){
            c--;
            prev=prev.next;
        }
        int a=slow.val;
        slow.val=prev.val;
        prev.val=a;
        return head;
    }
}