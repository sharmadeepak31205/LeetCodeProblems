package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class K_Diff_Pairs_In_Array {



    public static int findPairs(int[] nums, int k) {
        if(nums == null || nums.length <= 1 || k < 0){
            return 0;
        }

        Arrays.sort(nums);

        int res = 0;
        int value = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                value = map.get(i);
                map.put(i,value+1);
            }
            else{
                map.put(i,1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(k == 0){
                if(entry.getValue() >= 2){
                    res++;
                }
            }
            else{
                if(map.containsKey(entry.getKey() + k)){
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        findPairs(arr,-1);
    }

}
