package LeetCode;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 2) {
            return 0;
        }
        int result = 0;
        int product = 1;
        for (int i = 0, right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (i < nums.length && product >= k) {
                product /= nums[i++];
            }
            result += right - i + 1;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {10,5,2,6};
        int res = numSubarrayProductLessThanK(arr,100);
        System.out.print(res);
    }
}
