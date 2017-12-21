package LeetCode;

import java.util.*;

/**
 * Created by deepaksharma on 12/8/17.
 */
public class BinaryTreeInorderTraversalIterative {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Stack<TreeNode> s = new Stack<>();

        while(true){
            if(root != null){
                s.push(root);
                root = root.left;
            }
            else{
                if(s.isEmpty()){
                    break;
                }
                root = s.pop();
                result.add(root.val);
                root = root.right;
            }
        }

        return result;

    }

}
