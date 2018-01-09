package Array;

import java.util.*;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class ArrayNesting {

    public static int arrayNesting(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int max  = 0;

        for(int i = 0; i < nums.length; i++){

            int size = 0;

            for(int k = i; nums[k] >= 0; size++){
                int ak = nums[k];
                nums[k] = -1;
                k = ak;
            }

            max = Math.max(max , size);
        }

        return max;
    }

    public static void main(String[] args){

        int[] arr1 = {5,4,0,3,1,6,2};
        //int [] arr2 = {0,2,1};

        int s = arrayNesting(arr1);
        //int s1 = arrayNesting(arr2);

        System.out.println(s);
        //System.out.println(s1);

    }

}
