package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return head;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode temp = head;
        ListNode prev = newHead;

        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
            }
            else{
                prev = prev.next;
            }
            temp = temp.next;
        }

        return newHead.next;
    }
}
