package leetcode23;

class ListNode {
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


public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        int k;
        if (lists == null || (k = lists.length) == 0) {
            return null;
        }

        ListNode headNode = null;

        for(int i = 0; i < k; i++){
            // merge headnode and lists[i]
            headNode = mergeTwoLists(headNode, lists[i]);
        }

        return headNode;
    }
    
    // merge 2 listnode
 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

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
}

