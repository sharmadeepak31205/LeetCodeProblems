package Array;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class MaxProductSubArray {

    public static int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int maxHerePre = nums[0];
        int minHerePre = nums[0];
        int maxSoFar = nums[0];
        int max = 0;
        int min = 0;

        for(int i = 1; i < nums.length; i++){
            max = Math.max(Math.max(maxHerePre * nums[i], minHerePre * nums[i]), nums[i]);
            min = Math.min(Math.min(maxHerePre * nums[i], minHerePre * nums[i]), nums[i]);
            maxSoFar = Math.max(maxSoFar , max);
            maxHerePre = max;
            minHerePre = min;
        }

        return maxSoFar;
    }

    public static void main(String[] args){
        int[] arr= {2,3,-2,4};
        int result = maxProduct(arr);
        System.out.println(result);
    }
}
