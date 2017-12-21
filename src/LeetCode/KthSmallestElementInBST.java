package LeetCode;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class KthSmallestElementInBST {

    int num = 0;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        getKthSmallest(root,k);
        return num;
    }

    public void getKthSmallest(TreeNode root, int k){
        if(root == null){
            return;
        }

        getKthSmallest(root.left, k);
        count++;
        if(count == k){
            num = root.val;
            return;
        }
        getKthSmallest(root.right, k);
    }

}
