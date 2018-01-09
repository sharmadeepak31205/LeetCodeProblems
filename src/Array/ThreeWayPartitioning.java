package Array;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class ThreeWayPartitioning {

//    public static void threeWayPartition(int[] arr, int lowVal, int highVal) {
//        int n = arr.length;
//        int start = moveSmallerToLeft(arr, lowVal, n, 0);
//        int end = moveLargerToRight(arr, highVal, n, n - 1);
//        moveSmallerToLeft(arr, lowVal + 1, n, start);
//        moveLargerToRight(arr, highVal - 1, n, end);
//    }

//    private static int moveLargerToRight(int[] arr, int highVal, int n, int end) {
//        for (int i = end; i >= 0; i--) {
//            if (arr[i] > highVal) {
//                swap(arr, end, i);
//                end--;
//            }
//        }
//        return end;
//    }
//
//    private static int moveSmallerToLeft(int[] arr, int lowVal, int n, int start) {
//        for (int i = start; i < n; i++) {
//            if (arr[i] < lowVal) {
//                swap(arr, start, i);
//                start++;
//            }
//        }
//        return start;
//    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void threeWayPartition(int[] arr, int low, int high){
        int length = arr.length;

        int start = moveShorterToLeft(arr, length, 0, low);
        int end = moveLargerToRight(arr, length, length-1, high);
        moveShorterToLeft(arr, length, start, low+1);
        moveLargerToRight(arr, length, end, high-1);

    }

    public static int moveShorterToLeft(int[] arr, int length, int start, int low){

        for(int i = start; i < length; i++){
            if(arr[i] < low){
                swap(arr, i, start);
                start++;
            }
        }
        return start;
    }

    public static int moveLargerToRight(int[] arr, int length, int end, int high){

        for(int i = end; i >= 0; i--){
            if(arr[i] > high) {
                swap(arr, i, end);
                end--;
            }
        }
        return end;
    }


    public static void main(String[] args){
        ThreeWayPartitioning t = new ThreeWayPartitioning();
        int[] arr = {36,3,43,5,15,14,16,20,18};
        t.threeWayPartition(arr, 14, 20);
        for(int i : arr){
            System.out.print(i + ", ");
        }

    }
}
