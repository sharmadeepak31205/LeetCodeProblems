package Array;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                return i-1;
            }
        }
        return nums.length - 1;
    }
}
