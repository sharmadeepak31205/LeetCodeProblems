package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/27/17.
 */
public class PartitionList {

    public ListNode partition(ListNode node, int x) {

        if(node == null){
            return node;
        }

        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;

        while(node != null){
            ListNode next = node.next;
            node.next = null;
            if(node.val < x){
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }
                else{
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }
            else{
                if(afterStart == null){
                    afterStart = node;
                    afterEnd = afterStart;
                }
                else{
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }

            node = next;
        }

        if(beforeStart == null){
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
