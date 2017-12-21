package LeetCode;

import java.util.*;

/**
 * Created by deepaksharma on 11/12/17.
 */
public class ThreeSumClosest {


    public static int threeSumClosest(int[] nums, int target){

        int result = nums[0] + nums[1] + nums[nums.length - 1];

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] +nums[k];
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }

                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
            }
        }
        return result;
    }
}
