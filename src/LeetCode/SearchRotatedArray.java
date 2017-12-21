package LeetCode;

/**
 * Created by deepaksharma on 12/6/17.
 */
public class SearchRotatedArray {

    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }

        int l = 0; int r = nums.length -1;
         while(l < r){
             int mid = (l+r)/2;
             if(nums[mid] > nums[r]){
                 l = mid+1;
             }
             else{
                 r = mid;
             }
         }

        int rot = l;
        l = 0; r = nums.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            int realMid = (mid + rot)% nums.length;
            if(nums[realMid] == target){
                return realMid;
            }
            if(nums[realMid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2,3};
        int res =  search(arr,7);
        System.out.println(res);
    }

}
