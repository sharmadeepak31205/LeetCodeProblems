package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deepaksharma on 11/12/17.
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> list = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return list;
        }

        Arrays.sort(nums);

        for(int i = 0; i + 2 < nums.length; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int target = -nums[i];
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == target){
                    list.add(Arrays.asList(nums[i] + nums[j] + nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }

                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(nums[j] + nums[k] < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args){
        int[] arr = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }

}
