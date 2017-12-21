package LeetCode;

import java.util.List;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if(head == null) return null;

        ListNode sorted = mergeSort(head);
        return sorted;
    }

    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = getMiddle(head);
        ListNode nextMiddle = middle.next;
        middle.next = null;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextMiddle);
        ListNode result = sort(left,right);
        return result;
    }

    public ListNode sort(ListNode left, ListNode right){

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        ListNode result = null;

        if(left.val <= right.val){
            result = left;
            result.next = sort(left.next, right);
        }
        else{
            result = right;
            result.next = sort(left,right.next);
        }

        return result;
    }

    public ListNode getMiddle(ListNode head){
        if(head == null){
            return head;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null || fast.next == null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
