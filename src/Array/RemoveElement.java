package Array;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0; int j = 0;

        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
