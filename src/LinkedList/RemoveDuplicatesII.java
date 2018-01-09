package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/27/17.
 */
public class RemoveDuplicatesII {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        ListNode curr = head;
        fakeHead.next = head;

        while(curr != null){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }

            if(pre.next == curr){
                pre = pre.next;
            }
            else{
                pre.next = curr.next;
            }

            curr = curr.next;
        }

        return fakeHead.next;
    }
}
