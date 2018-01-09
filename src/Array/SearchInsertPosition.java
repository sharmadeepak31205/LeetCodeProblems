package Array;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int i = 0;

        for(; i < nums.length; i++){
            if(nums[i] == target || nums[i] > target){
                return i;
            }
        }

        return i;
    }
}
