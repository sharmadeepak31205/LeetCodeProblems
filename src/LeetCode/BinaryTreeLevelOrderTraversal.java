package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/11/17.
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        process(root,0,list);
        return list;
    }

    public void process(TreeNode root, int level, List<List<Integer>> list){
        if(root == null){
            return;
        }

        List<Integer> temp = null;

        if(level == list.size()){
            temp = new ArrayList<>();
            list.add(temp);
        }
        else{
            temp = list.get(level);
        }

        temp.add(root.val);

        process(root.left, level+1, list);
        process(root.right, level+1, list);
    }
}
