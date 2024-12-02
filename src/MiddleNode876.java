import java.util.List;

public class MiddleNode876 {

    public static void main(String[] args) {
//        middleNode(ListNode());
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}

