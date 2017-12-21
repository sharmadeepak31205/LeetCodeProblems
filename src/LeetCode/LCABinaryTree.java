package LeetCode;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class LCABinaryTree {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if( root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        if( left == null && right == null){
            return null;
        }

        return left != null ? left : right;

    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = null;
        root.left.right = new TreeNode(4);

        TreeNode p = root.right;
        TreeNode q = root.left.right;

        lowestCommonAncestor(root, p, q);

    }

}
