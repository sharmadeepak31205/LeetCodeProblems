package Tree;

import LeetCode.TreeNode;

import java.util.Stack;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class BinaryTreeFromPreorderAndInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0){
            return null;
        }

        int ip = 0; int pp = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[pp]);
        stack.push(root);
        pp++;
        TreeNode prev = null;

        while(pp < preorder.length){
            while(!stack.isEmpty() && stack.peek().val == inorder[ip]){
                prev = stack.pop();
                ip++;
            }
            TreeNode node = new TreeNode(preorder[pp]);

            if(prev != null){
                prev.right = node;
            }
            else{
                TreeNode curr = stack.peek();
                curr.left = node;
            }

            stack.push(node);
            pp++;
            prev = null;

        }

        return root;
    }
}
