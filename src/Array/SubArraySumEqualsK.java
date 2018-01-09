package Array;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class SubArraySumEqualsK {

    //Using Array Only
    public static int subarraySum(int[] nums, int k) {

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            if(sum == k){
                count++;
            }
            for(int j = i+1; j< nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }

        return count;
    }

    public static int subarraySumMapWay(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1};
        subarraySumMapWay(arr, 2);
    }
}
