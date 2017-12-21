package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/10/17.
 */
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> temp = new ArrayList<>();

        temp.add(new ArrayList<>());

        for (int i : nums) {

            List<List<Integer>> list = new ArrayList<>();

            for (List<Integer> r : temp) {
                List<Integer> l = new ArrayList<>(r);
                l.add(i);
                list.add(l);
            }

            temp.addAll(list);
        }

        return temp;

    }

    public static void main(String[] args){

        int[] nums = {1,2,3};

        subsets(nums);
    }
}
