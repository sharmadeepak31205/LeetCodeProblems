package Array;

import com.sun.tools.corba.se.idl.InterfaceGen;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class MinimalSizeSubArraySum {

    public int minSubArrayLen(int s, int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int i = 0; int j = 0; int sum = 0; int min = Integer.MAX_VALUE;

        while(j < nums.length){
            sum += nums[j++];

            while(sum >= s){
                min = Math.min(min, j-i);
                sum -= nums[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
