package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepaksharma on 1/4/18.
 */
public class SubArrayWithZeroSum {

    public static boolean subArraySumZero(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            if(arr[i] == 0 || sum == 0 || map.get(sum) != null){
                return true;
            }

            map.put(sum, i);
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1, 4, -2, -2, 5, -4, 3};
        boolean res = subArraySumZero(arr);
        System.out.print(res);
    }
}
