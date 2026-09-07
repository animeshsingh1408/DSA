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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode c=slow;
        ListNode p=null;
        ListNode f=null;

        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode t1=head;
        ListNode t2=p;
        int m=-1;

        while(t2!=null){
            int x=t1.val+t2.val;
            m=Math.max(x,m);
            t1=t1.next;
            t2=t2.next;
        }
        return m;
    }
}