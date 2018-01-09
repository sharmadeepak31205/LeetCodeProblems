package Array;

import java.util.Arrays;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class MaxProductThreeNumbers {

    public int maximumProduct(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;

        int a = nums[n-1] * nums[n-2] * nums[n-3];
        int b = nums[0] * nums[1] * nums[n-1];

        return a > b ? a : b;
    }

}
