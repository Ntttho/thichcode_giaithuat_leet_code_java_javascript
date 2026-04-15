package leetcode21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       ListNode node = new ListNode();
        ListNode ans = node;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                node.next = list2;
                list2 = list2.next;
            } else {
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }

        node.next = list1 != null ? list1 : list2;
        return ans.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // ListNode list1 = new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(9))));
        // ListNode list2 = new ListNode(4, new ListNode(5, new ListNode(7, new ListNode(7))));

        ListNode listNode1 = null;
        ListNode listNode2 = null;
        ListNode result = solution.mergeTwoLists(listNode1, listNode2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}

class ListNode {
    // dinh nghia listnode
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}