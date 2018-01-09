package Array;

import java.util.*;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class KthLargestElement {

    public static void kthLargestelement(int[] arr, int k){

        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * (o1 - o2);
            }
        });

        for(int i = 0; i < k; i++){
            System.out.println(list.get(i));
        }
    }

    public static void largestThreeno(){

        int[] arr = {10, 4, 3, 50, 23, 90};

        int one = Integer.MIN_VALUE; int two = Integer.MIN_VALUE; int three = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > one){
                three = two;
                two = one;
                one = arr[i];
            }
            else if(arr[i] > two){
                three = two;
                two = arr[i];
            }
            else if(arr[i] > three){
                three = arr[i];
            }
        }

        System.out.print(one + " " + two + " " + three);
    }


    public static void alternate(){
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        Arrays.sort(arr);

        int[] temp = new int[arr.length];

        int i = 0; int j = arr.length-1;

        int k = 0;

        while(k < arr.length){
            temp[k++] = arr[i++];
            temp[k++] = arr[j--];
        }

        System.out.print("");

    }

    public static void main(String[] args){

        alternate();
        largestThreeno();

        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        kthLargestelement(arr, 3);

    }
}
