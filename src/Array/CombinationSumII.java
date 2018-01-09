package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        List<List<Integer>> list = new ArrayList<>();

        if(candidates == null || candidates.length == 0){
            return list;
        }

        Arrays.sort(candidates);
        backTrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
        if(remain < 0){
            return;
        }
        else if(remain == 0){
            list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i-1]){
                    continue;
                }
                tempList.add(nums[i]);
                backTrack(list, tempList, nums, remain - nums[i], i+1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
