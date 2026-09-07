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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p=null;
        ListNode c=slow;
        ListNode f=null;

        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode t=p;
        ListNode temp=head;
           
        while(t!=null){
            if(temp.val!=t.val)
            return false;
           temp=temp.next;
           t=t.next;
        }
        return true;
        
    }
}