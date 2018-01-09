package Array;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class SegregateZeroAndOne {

    public static void segregate(int[] arr){

        int start = 0; int end = arr.length;

        for(int i = 0; i < end; i++){
            if(arr[i] == 0){
                swap(arr, start++, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate(arr);
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }
}
