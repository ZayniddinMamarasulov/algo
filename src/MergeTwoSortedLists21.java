public class MergeTwoSortedLists21 {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                curr.next = curr1;
                curr1 = curr1.next;
            } else {
                curr.next = curr2;
                curr2 = curr2.next;
            }

            curr = curr.next;
        }

        curr.next = curr1 != null ? curr1 : curr2;

        return head.next;
    }
}
