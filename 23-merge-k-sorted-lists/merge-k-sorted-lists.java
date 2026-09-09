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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) 
        return null;
        ArrayList<ListNode> list= new ArrayList<>();
        for(ListNode  n: lists)
        list.add(n);
        
        while(list.size()>1){
            int n=list.size();
            ListNode p=merge(list.get(n-2),list.get(n-1));
            list.remove(n-1);
            list.remove(n-2);
            list.add(p);
        }
        return list.get(0);
    }
    ListNode merge(ListNode head1,ListNode head2){
        ListNode t= new ListNode(-1);
        ListNode ans=t;

        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                t.next=head1;
                t=t.next;
                head1=head1.next;
            }
            else{
                t.next=head2;
                t=t.next;
                head2=head2.next;
            }
        }
        while(head1!=null){
            t.next=head1;
            t=t.next;
            head1=head1.next;
        }
         while(head2!=null){
            t.next=head2;
            t=t.next;
            head2=head2.next;
        }
        return ans.next;
    }
}