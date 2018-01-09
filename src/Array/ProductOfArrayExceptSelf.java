package Array;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        if(nums == null || nums.length == 0){
            return nums;
        }

        int[] res = new int[nums.length];

        for(int i = 0, temp = 1; i < nums.length; i++){
            res[i] = temp;
            temp *= nums[i];
        }

        for(int i = nums.length - 1, temp = 1; i >= 0; i--){
            res[i] *= temp;
            temp *= nums[i];
        }

        return res;
    }

}
