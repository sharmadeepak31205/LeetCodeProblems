package LeetCode;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class FindPivot {

    public int pivotIndex(int[] nums) {
        if(nums == null){
            return -1;
        }

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int left = 0;

        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                left += nums[i-1];
            }

            if(sum - left - nums[i] == left){
                return i;
            }
        }

        return -1;
    }
}
