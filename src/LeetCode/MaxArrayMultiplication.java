package LeetCode;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class MaxArrayMultiplication {

    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int maxHerePre = nums[0];
        int minHerePre = nums[0];
        int maxSoFar = nums[0];
        int minHere;
        int maxHere;

        for(int i = 1; i < nums.length; i++){
            maxHere = Math.max(Math.max(maxHerePre * nums[i], minHerePre * nums[i]) , nums[i]);
            minHere = Math.min(Math.min(maxHerePre * nums[i], minHerePre * nums[i]) , nums[i]);
            maxSoFar = Math.max(maxHere, maxSoFar);
            maxHerePre = maxHere;
            minHerePre = minHere;
        }

        return maxSoFar;
    }
}
