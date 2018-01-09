package Tree;

import LeetCode.TreeNode;

import java.util.Stack;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class BinaryTreeFromInorderAndPostorder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0){
            return null;
        }

        int ip = inorder.length - 1; int pp = postorder.length - 1;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[pp]);
        stack.push(root);
        pp--;
        TreeNode prev = null;

        while(pp >= 0){
            while(!stack.isEmpty() && stack.peek().val == inorder[ip]){
                prev = stack.pop();
                ip--;
            }

            TreeNode node = new TreeNode(postorder[pp]);

            if(prev != null){
                prev.left = node;
            }
            else{
                TreeNode curr = stack.peek();
                curr.right = node;
            }

            stack.push(node);
            pp--;
            prev = null;
        }

        return root;
    }
}
