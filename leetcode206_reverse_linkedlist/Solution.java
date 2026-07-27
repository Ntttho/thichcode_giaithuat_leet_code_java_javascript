package leetcode206_reverse_linkedlist;

import common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        // reverse normally
        if(head == null || head.next == null){
            return head;
        }
        ListNode end = reverseList(head.next);
        ListNode temp = end;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;

        head.next = null;
        
        return end;
    }
}
// it took away one of my days