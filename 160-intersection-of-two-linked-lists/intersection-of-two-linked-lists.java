/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;

        // first we find the length of the both LL
        // Move the bigger LL acc. to difference
        // then we find the equal node by traversing
        
        int a=0,b=0;
        while(temp1!=null){
            a++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            b++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(a>=b){
            a=a-b;
            while(a>0){
                temp1=temp1.next;
                a--;
            }
        }
        else{
        b=b-a;
         while(b>0){
                temp2=temp2.next;
                b--;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}