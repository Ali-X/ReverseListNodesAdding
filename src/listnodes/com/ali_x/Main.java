package listnodes.com.ali_x;

class Main {

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        if (l1 == null || l2 == null) {
            return result;
        }
        int summ = l1.val + l2.val;
        if (summ < 10) {
            result = new ListNode(summ);
            result.next = addTwoNumbers(l1.next, l2.next);
        } else {
            result = new ListNode(summ - 10);
            if (l1.next == null)
                result.next = new ListNode(1);
            else {
                l1.next.val = l1.next.val + 1;
                result.next = addTwoNumbers(l1.next, l2.next);
            }
        }
        return result;
    }
}
