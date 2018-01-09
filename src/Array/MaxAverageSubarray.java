package Array;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class MaxAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int i = 0; int j = 0;
        double sum = 0;
        double max = Integer.MIN_VALUE;

        while(j < k){
            sum += nums[j++];
        }

        while(j < nums.length){
            max = Math.max(sum, max);
            sum -= nums[i++];
            sum += nums[j++];
        }

        max = Math.max(sum, max);

        return max / k;
    }

}
