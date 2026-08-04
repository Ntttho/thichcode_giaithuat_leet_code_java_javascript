package leetcode82;
import java.util.LinkedHashMap;
import java.util.Map;

import common.ListNode;

class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode result = new ListNode();
        ListNode brower = result;
        while (head != null || head.next != null) {
            ListNode pre = head;
            head = head.next;

            if (head == null) {
                brower.next = pre;
                break;
            } else if (pre.val != head.val) {
                brower.next = pre;
                brower = brower.next;
                brower.next = null;
            } else {
                while(head.val == pre.val){
                    head = head.next;
                    if(head == null){
                        return result.next;
                    }
                }
            }

        }
        return result.next;
    }


    public ListNode badDeleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        ListNode temp = head;
        while (temp != null) {
            hashMap.put(temp.val, hashMap.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        
        ListNode newHead = new ListNode();
        ListNode brower = newHead;
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            int k = entry.getKey(), v = entry.getValue();
            if(v == 1){
                brower.next = new ListNode(k);
                brower = brower.next;
            }
        }

        return newHead.next;
    }
}