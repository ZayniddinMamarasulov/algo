import java.util.List;

public class IsPalindrome234 {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);

        listNode.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(isPalindrome(listNode));
    }

    public static ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    private static boolean isTheSame(ListNode head1, ListNode head2) {

        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) return false;

            head1 = head1.next;
            head2 = head2.next;
        }

        return true;

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode middle = findMiddle(head);
        middle = reverse(middle);

        return isTheSame(head, middle);
    }

}
