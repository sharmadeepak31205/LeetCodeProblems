package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class DetectCycleII {

    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }

        fast = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
