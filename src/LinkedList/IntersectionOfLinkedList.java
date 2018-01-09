package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class IntersectionOfLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null){
            return null;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){

            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }

        return temp1;
    }
}
