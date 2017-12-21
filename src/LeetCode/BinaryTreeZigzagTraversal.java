package LeetCode;

import java.util.*;

/**
 * Created by deepaksharma on 12/11/17.
 */
public class BinaryTreeZigzagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> temp = new ArrayList<>();

            while(!s1.isEmpty()){
                root = s1.pop();
                temp.add(root.val);
                if(root.left != null){
                    s2.push(root.left);
                }
                if(root.right != null){
                    s2.push(root.right);
                }
            }
            list.add(temp);
            temp = new ArrayList<>();

            while(!s2.isEmpty()){
                root = s2.pop();
                temp.add(root.val);
                if(root.right != null){
                    s1.push(root.right);
                }
                if(root.left != null){
                    s1.push(root.left);
                }
            }
            if(temp.size() != 0){
                list.add(temp);
            }
        }
        return list;
    }
}
