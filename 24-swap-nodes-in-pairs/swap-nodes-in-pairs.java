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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode odd =new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode ans=new ListNode(-1);
        ListNode x=ans;
        ListNode a=odd;
        ListNode b=even;
        ListNode temp=head;

        int c=1;
        while(temp!=null){
            if(c==1){
            odd.next=temp;
            odd = temp;
            c=0;
            }
            else{
                even.next=temp;
                even = temp;
                c=1;
            }
            temp=temp.next;
        }
        odd.next=null;
        even.next=null;
            c=1;
            a=a.next;
            b=b.next;
            while(b!=null){
                if(c==1){
                    ans.next=b;
                    ans=ans.next;
                    b=b.next;
                    c=0;
                }
                else{
                    ans.next=a;
                    ans=ans.next;
                    a=a.next;
                    c=1;
                }
            }
            while(a!=null){
                ans.next=a;
                ans=ans.next;
                a=a.next;
            }
        return x.next;
    }
}