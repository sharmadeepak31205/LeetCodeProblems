package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/27/17.
 */
public class RemoveDuplicatesFromLinkedList {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode temp = head;

        while(temp != null){

            if(temp.next == null){
                break;
            }

            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return head;
    }
}
