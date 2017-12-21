package LeetCode;

/**
 * Created by deepaksharma on 12/5/17.
 */
public class searchRange {

    public int[] searchRange(int[] nums, int target) {

        int start = search(nums,target);

        if(start == nums.length || nums[start] != target){
            return new int[]{-1,-1};
        }

        return new int[]{start, search(nums,target+1)-1};
    }

    public int search(int[] arr, int target){
        int l = 0; int r = arr.length;

        while(l < r){

            int mid = (l + r)/2;

            if(arr[mid] < target){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}
