package LeetCode;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class LongestContiguousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int max = 1;
        int maxSoFar = 1;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                max++;
            }
            else{
                maxSoFar = Math.max(maxSoFar, max);
                max = 1;
            }
        }

        return Math.max(maxSoFar, max);
    }

}
