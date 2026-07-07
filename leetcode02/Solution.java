package leetcode02;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
exam
2 -> 4 -> 3
5 -> 6 -> 4

result = 342 + 464 = 807 => 7 -> 0 -> 8
*/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int re = 0;
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while ( l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + re;
            int resultSum = sum % 10;
            re = sum / 10;
            temp.next = new ListNode(resultSum);
            temp = temp.next;
            l1 = l1.next; 
            l2 = l2.next;
        }

        if (re != 0) {
            temp.next = new ListNode(re);
        }

        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
}
