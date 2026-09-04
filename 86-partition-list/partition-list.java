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
    public ListNode partition(ListNode head, int x) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-2);
        ListNode temp=head;
        ListNode a=d1;
        ListNode b=d2;
        while(temp!=null){
            if(temp.val<x){
                d1.next=temp;
                d1=d1.next;
            }
            else{
                 d2.next=temp;
                d2=d2.next;
            }
            temp=temp.next;
        }
        d2.next=null;
        d1.next=b.next;
        return a.next;
    }
}