package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class SubSetII {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> each = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return list;
        }

        helper(list, each, 0, nums);
        return list;

    }

    public static void helper(List<List<Integer>> list, List<Integer> each, int pos, int[] n){
        if(pos <= n.length){
            list.add(each);
        }

        int i = pos;

        while(i < n.length){
            each.add(n[i]);
            helper(list, new ArrayList<>(each), i+1, n);
            each.remove(each.size() - 1);
            i++;
            while(i < n.length && n[i] == n[i-1]){
                i++;
            }
        }

        return;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2};
        subsetsWithDup(arr);

    }

}
