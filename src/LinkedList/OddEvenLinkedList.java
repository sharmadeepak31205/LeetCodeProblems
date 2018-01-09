package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

}
