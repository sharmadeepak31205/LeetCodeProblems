package Array;

import java.util.Arrays;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class RearrangeArrayAlternatively {

    public int[] rearrangeArray(int[] arr){

        Arrays.sort(arr);

        int i = 0; int j = arr.length-1;
        int k = 0; int[] temp = new int[arr.length];

        while(i <= j){

            if(k < temp.length){
                temp[k++] = arr[j--];
            }

            if(k < temp.length){
                temp[k++] = arr[i++];
            }
        }

        for(int l : temp){
            System.out.println(l);
        }

        return temp;
    }

    public static void main(String[] args){
        RearrangeArrayAlternatively r = new RearrangeArrayAlternatively();
        int[] arr = {1,2,3,4,5,6,7};
        r.rearrangeArray(arr);
    }
}
