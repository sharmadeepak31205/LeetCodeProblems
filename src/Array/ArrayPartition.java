package Array;

import java.util.Arrays;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0; i < nums.length;){
            sum += nums[i];
            i += 2;
        }

        return sum;
    }
}
