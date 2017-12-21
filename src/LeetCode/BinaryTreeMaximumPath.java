package LeetCode;

import java.sql.SQLException;

/**
 * Created by deepaksharma on 12/11/17.
 */
public class BinaryTreeMaximumPath {

    int max = 0;

    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }

        max = Integer.MIN_VALUE;
        cal(root);
        return max;
    }

    public int cal(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Math.max(0,cal(root.left));
        int right = Math.max(0,cal(root.right));

        max = Math.max(max, left+right+root.val);

        return Math.max(left,right)+root.val;
    }
}
