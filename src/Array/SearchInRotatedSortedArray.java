package Array;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class SearchInRotatedSortedArray {

    public boolean search(int[] nums, int target) {

        int left = 0; int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[mid] < nums[right] || nums[mid] < nums[left]){

                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }

            }
            else if(nums[mid] > nums[left] || nums[mid] > nums[right]){
                if(target < nums[mid] && target >= nums[left]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args){
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        int[] arr = {3,1};
        s.search(arr,0);
    }
}
