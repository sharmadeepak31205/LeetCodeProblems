package LeetCode;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }

        int totalSum = (nums.length * (nums.length + 1))/2;

        return totalSum - sum;
    }

}
