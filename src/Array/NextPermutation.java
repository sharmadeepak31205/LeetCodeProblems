package Array;

import java.util.Arrays;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length == 0){
            return;
        }

        int i = 0;

        for(i = nums.length-1; i > 0; i--){
            if(nums[i-1] < nums[i]){
                break;
            }
        }

        if(i == 0){
            Arrays.sort(nums);
        }
        else{
            int x = nums[i-1]; int smallest = i;

            for(int j = i+1; j < nums.length; j++){
                if(nums[j] > x && nums[j] < nums[smallest]){
                    smallest = j;
                }
            }

            int temp = nums[smallest];
            nums[smallest] = nums[i-1];
            nums[i-1] = temp;

            Arrays.sort(nums, i, nums.length);
        }
    }

    public static void main(String[] args){
        NextPermutation n = new NextPermutation();
        int[] arr = {1,3,2};
        n.nextPermutation(arr);
    }
}
