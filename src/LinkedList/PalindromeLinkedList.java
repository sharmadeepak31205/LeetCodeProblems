package LinkedList;

import LeetCode.ListNode;

import java.util.Stack;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            stack.push(slow.val);
            slow = slow.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        while(!stack.isEmpty()){
            if(stack.pop() != slow.val){
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

}
