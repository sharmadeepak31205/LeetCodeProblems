package LinkedList;

import LeetCode.ListNode;
import LeetCode.TreeNode;

/**
 * Created by deepaksharma on 12/27/17.
 */
public class ConvertSortedLinkedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        TreeNode node = new TreeNode(slow.val);

        if(prev != null){
            prev.next = null;
        }
        else{
            head = null;
        }

        node.left = sortedListToBST(head);
        node.right = sortedListToBST(slow.next);

        return node;
    }
}
