package java_leetcode.leetcode24;

import common.ListNode;


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


class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head, newHead = head.next, pre = null;

        while ( temp != null && temp.next != null ) {
            ListNode front = temp, back = temp.next;
            temp = back.next;

            front.next = back.next;
            back.next = front;
            if(pre != null){
                pre.next = back;
            }
            pre = front;

        }
        return newHead;
    }

    public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next;
        head.next = swapPairs2(temp.next);
        temp.next = head;

        return temp;
    }
}
