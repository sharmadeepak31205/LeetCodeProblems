package LeetCode;

/**
 * Created by deepaksharma on 12/11/17.
 */
public class SortColors {

    public static void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        int second=n-1, zero=0;

        for (int i=0; i<=second; i++) {
            while (nums[i]==2 && i<second){
                swap(i,second--, nums);
            }
            while (nums[i]==0 && i>zero) {
                swap(i, zero++, nums);
            }
        }
    }

    public static void swap(int first, int second, int[] nums){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,2,2,1,0,2,0,1,0};
        sortColors(arr);
    }
}
