package LeetCode;

/**
 * Created by deepaksharma on 12/11/17.
 */
public class SortedArrayToBinary {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        return generate(nums,0,nums.length-1);
    }

    public TreeNode generate(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = generate(nums,left,mid-1);
        root.right = generate(nums, mid+1, right);
        return root;
    }
}
