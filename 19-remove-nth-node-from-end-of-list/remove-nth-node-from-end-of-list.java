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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        if(head.next==null)
        return null;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
         if (n == c) {
            return head.next;
        }
        int p=c-n;
        temp=head;
        c=0;
        
        while(c<p-1){
            temp=temp.next;
            c++;
        }
        
        temp.next=temp.next.next;
        return head;
    }
}