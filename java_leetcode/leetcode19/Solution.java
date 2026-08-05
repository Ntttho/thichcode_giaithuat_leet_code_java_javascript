package java_leetcode.leetcode19;

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
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int i = 0, length = length(head);

        if(n == length){
            return head.next;
        }

        while(temp.next != null && length - i - 1 != n){
            temp = temp.next;
            i++;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }

        return head;
    }

    int length(ListNode head){
        int i = 0;
        ListNode temp = head;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }
}
