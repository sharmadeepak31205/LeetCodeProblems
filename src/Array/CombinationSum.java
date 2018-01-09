package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();

        if(candidates == null || candidates.length == 0){
            return list;
        }

        Arrays.sort(candidates);
        backTrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }


    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
        if(remain < 0 ){
            return;
        }
        else if(remain == 0){
            list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backTrack(list, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
