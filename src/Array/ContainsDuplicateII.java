package Array;

import java.util.HashSet;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}
