package LeetCode;

/**
 * Created by deepaksharma on 11/20/17.
 */
public class SwapNodesPair {

    public static ListNode swapPair(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPair(third);

        return second;
    }


    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        swapPair(node1);
    }
}
