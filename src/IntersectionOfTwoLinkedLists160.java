public class IntersectionOfTwoLinkedLists160 {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headB != null) {
            ListNode curr1 = headA;
            while (curr1 != null) {
                if (curr1 == headB) return headB;
                curr1 = curr1.next;
            }
            headB = headB.next;
        }

        return null;
    }
}
