package LinkedList;

import LeetCode.ListNode;

import java.util.Stack;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        if(head == null) return;

        Stack<Integer> stack = new Stack<>();

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = slow;
        slow = slow.next;
        prev.next = null;

        while(slow != null){
            stack.push(slow.val);
            slow = slow.next;
        }

        ListNode node = head;
        ListNode temp = head;

        while(!stack.isEmpty()){
            temp = node.next;
            node.next = new ListNode(stack.pop());
            node = node.next;
            node.next = temp;
            node = node.next;
        }
    }

    public static void main(String[] args){
        ReorderList l = new ReorderList();

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        l.reorderList(node);
    }
}
