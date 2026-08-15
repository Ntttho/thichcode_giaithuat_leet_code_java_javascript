package java_leetcode.linked_list.leetcode206_reverse_linkedlist;

import common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        // reverse normally
        if (head == null || head.next == null) {
            return head;
        }
        ListNode end = reverseList(head.next);
        ListNode temp = end;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        head.next = null;

        return end;
    }

    public ListNode reverseList2(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public ListNode reverseList3(ListNode head) {
        /* recursive solution */
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}
// it took away one of my days
