/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode b=head;
        
        if(head==null || head.next==null)
        return null;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            break;
        }
        while(slow!=null){
            if(b==slow){
                return b;
            }
            b=b.next;
            slow=slow.next;
            
        }
        return null;
    }
}