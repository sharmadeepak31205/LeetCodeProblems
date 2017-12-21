package LeetCode;

import java.util.HashMap;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        HashMap<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int[] value = map.get(nums[i]);
                value[0]++;
                value[2] = i;
                map.put(nums[i], value);
            }
            else{
                map.put(nums[i], new int[] {1,i,i});
            }
        }

        int degree = Integer.MIN_VALUE;
        int res = 0;

        for(int[] temp : map.values()){
            if(temp[0] > degree){
                degree = temp[0];
                res = temp[2] - temp[1] + 1;
            }
            else if(temp[0] == degree){
                res = Math.min(res,temp[2] - temp[1] + 1);
            }
        }

        return res;
    }

}
