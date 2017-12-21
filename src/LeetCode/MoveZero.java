package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class MoveZero {

    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        while(j < nums.length){
            nums[j++] = 0;
        }
    }

}
