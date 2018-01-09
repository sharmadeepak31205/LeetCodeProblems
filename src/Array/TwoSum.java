package Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        int[] res = new int[]{-1,-1};

        if(numbers == null || numbers.length == 0){
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                res[0] = map.get(target-numbers[i]);
                res[1] = i;
                return res;
            }
            else{
                map.put(numbers[i], i);
            }
        }

        return res;
    }
}
