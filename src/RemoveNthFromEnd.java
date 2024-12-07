public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        listNode.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        removeNthFromEnd(listNode, 4);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        while (n > 0 && right != null) {
            right = right.next;
            n--;
        }

        // above while means difference between left and right = n
        // and above code : when right is null, left is position of n from the END

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        // delete
        left.next = left.next.next;

        return dummy.next;
    }
}
