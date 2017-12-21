package LeetCode;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int a = 0; int b = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(i % 2 == 0){
                a = Math.max(a+nums[i],b);
            }
            else{
                b = Math.max(a,b+nums[i]);
            }
        }

        return Math.max(a,b);
    }
}
