package Array;

/**
 * Created by deepaksharma on 1/4/18.
 */
public class QuickSort {

    public static void sort(int[] arr){
        quicksort(arr, 0, arr.length-1);
    }

    public static void quicksort(int[]arr, int low, int high){

        int i = low; int j = high;
        int temp; int pivot = arr[(low+high)/2];

        while(i <= j){

            while(arr[i] < pivot){
                i++;
            }

            while(arr[j] > pivot){
                j--;
            }

            if(i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if(low < j){
                quicksort(arr,low,j);
            }

            if(i < high){
                quicksort(arr, i, high);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567};

        sort(arr);

        System.out.print(arr);
    }
}
