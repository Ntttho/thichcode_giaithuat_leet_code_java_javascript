package java_leetcode.linked_list.leetcode1721;

import common.ListNode;

// swapping-nodes-in-a-linked-list

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prp = head, temp = head; int i = 1;
        while(i < k){
            prp = prp.next;
            i++;
        }
        ListNode first = prp;

        while(prp.next != null){
            prp = prp.next;
            temp = temp.next;
        }
        ListNode second = temp;

        int tempInt = second.val;

        second.val = first.val;
        first.val = tempInt;

        return head;
    }
}
