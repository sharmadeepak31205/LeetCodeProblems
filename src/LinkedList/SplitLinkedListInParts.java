package LinkedList;

import LeetCode.ListNode;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class SplitLinkedListInParts {

    public ListNode[] splitListToParts(ListNode root, int k) {

        ListNode[] nodeArr = new ListNode[k];

        if(root == null || k <= 0){
            return nodeArr;
        }

        ListNode temp = root;
        int length = 0;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        int len = length / k;
        int rem = length % k;
        temp = root;

        for(int i = 0; i < k; i++){
            ListNode node = new ListNode(0);
            ListNode tempNode = node;
            int tempLen = rem > 0 ? len + 1 : len;
            rem--;

            while(tempLen > 0 && temp != null){
                tempNode.next = new ListNode(temp.val);
                temp = temp.next;
                tempNode = tempNode.next;
                tempLen--;
            }

            nodeArr[i] = node.next;
        }

        return nodeArr;
    }

    public static void main(String[] args){
        SplitLinkedListInParts s = new SplitLinkedListInParts();

        int len = 8;
        int i = 1;
        ListNode node = new ListNode(0);
        ListNode temp = node;
        while(i < len){
            temp.next = new ListNode(i++);
            temp = temp.next;
        }

        s.splitListToParts(node.next, 3);
    }
}
