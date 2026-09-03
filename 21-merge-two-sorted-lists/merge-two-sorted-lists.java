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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode t=new ListNode(-1);
        ListNode a=t;

        while(i!=null && j!=null){
            if(i.val>=j.val){
                t.next=j;
                j=j.next;
            }
            else{
                t.next=i;
                i=i.next;
            }
            t=t.next;        
        }
        while(i!=null){
            t.next=i;
            t=t.next;
            i=i.next;
        }
        while(j!=null){
            t.next=j;
            t=t.next;
            j=j.next;
        }
        return a.next;
    }
}