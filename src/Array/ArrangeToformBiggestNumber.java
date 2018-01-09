package Array;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class ArrangeToformBiggestNumber {

    public static void arrange(int[] arr){

        List<String> list = new ArrayList<>();

        for(int i : arr){
            list.add(String.valueOf(i));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        int k = 0;

        for(String s : list){
            arr[k++] = Integer.parseInt(s);
        }

        for(int i = 0, j = arr.length-1; i <= j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int j : arr){
            System.out.print(j + ", ");
        }
    }


    public static void replaceMultiplication(int[] arr){

        if(arr.length <= 1){
            return;
        }

        int[] temp = new int[arr.length];
        temp[0] = arr[0] * arr[1];

        for(int i = 1; i < arr.length-1; i++){
            temp[i] = arr[i-1] * arr[i+1];
        }

        temp[temp.length-1] = arr[arr.length-2] * arr[arr.length-1];

        for(int j : temp){
            System.out.print(j + ", ");
        }
    }
    public static void main(String[] args){

        int[] nums = {2, 3, 4, 5, 6};
        replaceMultiplication(nums);

        System.out.println();

        int[] arr = {54, 546, 548, 60};
        arrange(arr);

    }
}
