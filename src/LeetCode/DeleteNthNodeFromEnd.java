package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by deepaksharma on 11/19/17.
 */
public class DeleteNthNodeFromEnd {

    public static ListNode deleteNthNode(ListNode head, int n){

        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && n-- > 0){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l1.next = l2;
        deleteNthNode(l1,1);
    }
}
