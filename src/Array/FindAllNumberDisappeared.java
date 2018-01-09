package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class FindAllNumberDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return list;
        }

        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;

            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }

}
