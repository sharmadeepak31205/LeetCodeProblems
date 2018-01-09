package Array;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class FindMinInRotatedArray {

    public static int findMin(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int left = 0; int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }

            if(nums[left] <= nums[mid] && nums[mid] > nums[right] ){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,0,1,2};
        int res = findMin(arr);
        System.out.print(res);
    }

}
