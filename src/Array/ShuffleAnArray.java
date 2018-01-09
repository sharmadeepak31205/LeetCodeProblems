package Array;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class ShuffleAnArray {

    public static void shuffle(int[] arr){

        int[] temp = new int[arr.length];

        HashSet<Integer> set = new HashSet<>();

        int i = 0;

        while(i < arr.length){

            int tempNo = getRandom(0, arr.length-1);
            if(set.add(arr[tempNo])){
                temp[i++] = arr[tempNo];
            }
        }

        for(int j : temp){
            System.out.print(j + ", ");
        }

    }

    public static int getRandom(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        shuffle(arr);

    }
}
