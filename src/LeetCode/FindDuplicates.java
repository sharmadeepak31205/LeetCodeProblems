package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class FindDuplicates {

    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int slow = 0;
        slow = nums[slow];
        int fast = 0;
        fast = nums[nums[fast]];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}
