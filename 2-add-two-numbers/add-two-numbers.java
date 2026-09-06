class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(-1);
        ListNode p = ans;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int n1 = 0;
            int n2 = 0;

            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }

            int sum = n1 + n2 + carry;

            int rem = sum % 10;
            carry = sum / 10;

            ListNode t = new ListNode(rem);

            p.next = t;
            p = p.next;
        }

        if (carry != 0) {
            p.next = new ListNode(carry);
        }

        return ans.next;
    }
}