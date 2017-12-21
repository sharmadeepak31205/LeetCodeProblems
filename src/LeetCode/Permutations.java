package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by deepaksharma on 12/11/17.
 */
public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new LinkedList<>();

        list.add(new ArrayList<>());

        int size = 0;

        for(int j : nums){
            size = list.size();
            for(; size > 0; size--){
                List<Integer> r = list.remove(0);
                for(int i = 0; i <= r.size(); i++) {
                    List<Integer> t = new ArrayList<>(r);
                    t.add(i,j);
                    list.add(t);
                }
            }
        }
        return list;
    }

    public static void main(String[] args){

        int[] nums = {1,2,3};

        permute(nums);
    }
}
