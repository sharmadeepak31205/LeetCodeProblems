package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }

        int min = Integer.MAX_VALUE;
        int firstMin = Integer.MAX_VALUE;

        for(int i : nums){
            if(i <= min){
                min = i;
            }
            else if(i < firstMin){
                firstMin = i;
            }
            else if(i > firstMin){
                return true;
            }
        }
        return false;
    }

}
