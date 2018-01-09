package Array;

import java.util.Arrays;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int[] temp = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;

        while(left < nums.length && nums[left] == temp[left]){
            left++;
        }

        while(right > left && nums[right] == temp[right]){
            right--;
        }

        return right - left + 1;
    }

}
