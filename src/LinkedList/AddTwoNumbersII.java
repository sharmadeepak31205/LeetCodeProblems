package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null){
            return l1;
        }

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);

        int carry = 0;
        int first = 0;
        int second = 0;

        ListNode res1 = new ListNode(0);
        ListNode res = res1;

        while(temp1 != null || temp2 != null){
            if(temp1 != null){
                first = temp1.val;
                temp1 = temp1.next;
            }

            if(temp2 != null){
                second = temp2.val;
                temp2 = temp2.next;
            }

            int sum = first + second + carry;

            if(sum > 9){
                sum = sum % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }

            res.next = new ListNode(sum);
            res = res.next;
            first = 0;
            second = 0;
        }

        if(carry != 0){
            res.next = new ListNode(carry);
        }

        return reverse(res1.next);

    }

    public ListNode reverse(ListNode root){

        ListNode temp = root;
        ListNode next = root;
        ListNode prev = null;

        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public static void main(String[] args){
        AddTwoNumbersII a = new AddTwoNumbersII();

        int len = 8;
        int i = 1;
        ListNode node = new ListNode(7);
        node.next = new ListNode(2);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(3);

        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(4);

        a.addTwoNumbers(node,node1);
    }
}
