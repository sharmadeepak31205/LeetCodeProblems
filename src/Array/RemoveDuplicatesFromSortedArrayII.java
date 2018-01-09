package Array;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class RemoveDuplicatesFromSortedArrayII {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }

        return i;
    }

    public static int removeDuplicatesI(int[] nums) {
        int i = 0;

        for(int n : nums){
            if(i < 1 || n > nums[i-1]){
                nums[i++] = n;
            }
        }

        return i;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,1,1,1,2,2,2,3,3,3,4,4};
        int res = removeDuplicates(arr);
        int res1 = removeDuplicatesI(arr);
        System.out.print(res);
        System.out.print(res1);
    }
}
