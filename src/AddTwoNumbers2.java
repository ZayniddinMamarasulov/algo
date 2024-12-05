public class AddTwoNumbers2 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);
        ListNode node14 = new ListNode(9);
        ListNode node15 = new ListNode(9);
        ListNode node16 = new ListNode(9);
        listNode1.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;

        ListNode listNode2 = new ListNode(9);
        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(9);
        ListNode node23 = new ListNode(9);
        listNode2.next = node21;
        node21.next = node22;
        node22.next = node23;

        ListNode res = addTwoNumbers(listNode1, listNode2);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int digit = 0;
        ListNode currentNode = new ListNode(0);

        ListNode head = currentNode;

        while (l1 != null || l2 != null) {
            int lOne = l1 != null ? l1.val : 0;
            int lTwo = l2 != null ? l2.val : 0;

            int total = lOne + lTwo + carry;

            digit = total % 10;
            carry = total / 10;
            currentNode.next = new ListNode(digit);
            currentNode = currentNode.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

            if (carry != 0) {
                currentNode.next = new ListNode(carry);
            }
        }

        return head.next;
    }
}
