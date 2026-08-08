class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            // Save the next node
            ListNode next = current.next;

            // Reverse the pointer
            current.next = prev;

            // Move prev and current forward
            prev = current;
            current = next;
        }

        return prev;
    }
}