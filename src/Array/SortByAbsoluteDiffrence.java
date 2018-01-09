package Array;

import java.util.*;

/**
 * Created by deepaksharma on 1/1/18.
 */
public class SortByAbsoluteDiffrence {

    public static void main (String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        rearrangAlt(nums);

        Map<Integer, List<Integer>> map = new TreeMap<>();
        int[] arr = {10, 5, 3, 9, 2}; int x = 7;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(Math.abs(arr[i] - x))){
                List<Integer> value = map.get(Math.abs(arr[i] - x));
                value.add(arr[i]);
                map.put(Math.abs(arr[i] - x), value);
            }
            else{

                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(Math.abs(arr[i] - x), list);
            }
        }
        int k = 0;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            for(int i : entry.getValue()){
                arr[k++] = i;
            }
        }

        for(int i : arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void rearrangAlt(int[] arr){
        int[] temp = new int[arr.length];

        int i = 0; int j = arr.length-1;
        int k = 0;
        while(i < j){
            temp[k++] = arr[j--];
            temp[k++] = arr[i++];
        }

        if(i == j){
            temp[k++] = arr[i];
        }
    }
}
