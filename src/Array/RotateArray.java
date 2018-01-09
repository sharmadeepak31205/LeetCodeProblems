package Array;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            res[(i % k) / nums.length] = nums[i];
        }
    }


}
