package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class ThreeSumSmaller {

    public static int threeSumSmaller(int[] nums, int target) {

        Arrays.sort(nums);
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){
            int left = i+1; int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];
                if(sum  >= target){
                    right--;
                }
                else{
                    cnt += right - left;
                    left++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        int[] arr = {-2, 0, 1, 3};
        int res = threeSumSmaller(arr,5);
        System.out.println(res);
    }
}
