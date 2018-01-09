package Array;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class ReplaceElementWithGreatestOnright {

    public static void replace(int[] arr){

        int length = arr.length;

        int maxFromRight = arr[length-1];

        for(int i = length - 2; i >= 0; i--){
            int temp = arr[i];

            arr[i] = maxFromRight;

            if(maxFromRight < temp){
                maxFromRight = temp;
            }
        }

        arr[arr.length - 1] = -1;
    }

    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        replace(arr);
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }
}
