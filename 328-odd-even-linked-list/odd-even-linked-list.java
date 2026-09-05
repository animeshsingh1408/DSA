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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-2);
        ListNode temp=head;
        ListNode a=odd;
        ListNode b=even;
        int c=1;
 
        while(temp!=null){
            if(c==1){
            odd.next=temp;
            odd=odd.next;
            c=0;
            }
            else{
            even.next=temp;
            even=even.next;
            c=1;
            }
            temp=temp.next;
        }
        even.next=null;
        odd.next=b.next;
        return a.next;
       
    }
}