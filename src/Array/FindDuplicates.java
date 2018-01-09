package Array;

import java.util.*;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return list;
        }

        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] < 0){
                list.add(Math.abs(val)+1);
            }

            nums[val] = -nums[val];
        }

        return list;
    }
}
