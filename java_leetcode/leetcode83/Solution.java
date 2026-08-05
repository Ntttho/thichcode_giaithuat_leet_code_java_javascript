package java_leetcode.leetcode83;

import common.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // head is sorted so we only need remove connection of node have duplication
        if(head == null){
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            ListNode cur = temp.next;
            if (temp.val == cur.val) {
                temp.next = cur.next;
            }else{
                temp = temp.next;
            }
        }


        return head;
    }
}
