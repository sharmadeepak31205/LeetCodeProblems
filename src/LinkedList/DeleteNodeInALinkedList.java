package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {

        if(node == null){
            return;
        }
        if(node.next == null){
            node = null;
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;

    }
}
