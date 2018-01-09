package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == null){
                return false;
            }

            if(fast.val == slow.val){
                return true;
            }
        }

        return false;
    }
}