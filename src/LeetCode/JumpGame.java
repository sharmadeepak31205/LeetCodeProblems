package LeetCode;

/**
 * Created by deepaksharma on 12/6/17.
 */
public class JumpGame {

    public boolean canJump(int[] nums) {

        if(nums == null || nums.length == 0){
            return false;
        }

        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(max < i){
                return false;
            }

            max = Math.max(nums[i]+ i, max);
        }
        return true;
    }
}
