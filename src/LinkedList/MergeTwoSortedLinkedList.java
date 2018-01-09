package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/27/17.
 */
public class MergeTwoSortedLinkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null){
            return null;
        }

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode temp3 = new ListNode(0);
        ListNode result = temp3;

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                result.next = temp1;
                temp1 = temp1.next;
                result = result.next;
            }
            else {
                result.next = temp2;
                temp2 = temp2.next;
                result = result.next;
            }
        }

        while(temp1 != null){
            result.next = temp1;
            temp1 = temp1.next;
            result = result.next;
        }

        while(temp2 != null){
            result.next = temp2;
            temp2 = temp2.next;
            result = result.next;
        }
        return temp3.next;
    }
}
