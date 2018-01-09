package Array;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {
        if(nums == null || nums.length == 0){
            return true;
        }

        boolean flag = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                if(flag){
                    if(i > 0 && nums[i + 1] < nums[i - 1]){
                        nums[i+1] = nums[i];
                    }
                    else{
                        nums[i] = nums[i+1];
                    }

                    flag = false;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        int[] nums = {4,2,3};
        boolean res =  checkPossibility(nums);

        System.out.print(res);
    }

}
