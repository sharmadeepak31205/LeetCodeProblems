package String;

import java.util.Arrays;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class NextGreaterElement {

    public static int nextGreaterElement(int n) {

        char[] arr = String.valueOf(n).toCharArray();
        int i = 0;
        int j = 0;

        for(i = arr.length - 1; i > 0; i--){
            if(arr[i-1] < arr[i]){
                break;
            }
        }

        if( i == 0){
            return -1;
        }

        int x = arr[i-1]; int smallest = i;

        for(j = i+1; j < arr.length; j++){
            if(arr[j] > x && arr[j] < arr[smallest]){
                smallest = j;
            }
        }

        char temp = arr[smallest];
        arr[smallest] = arr[i-1];
        arr[i-1] = temp;

        Arrays.sort(arr, i, arr.length);

        long val = Long.parseLong(new String(arr));

        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }

    public static void main(String[] args){
        int res = nextGreaterElement(12443322);
        System.out.print(res);
    }
}
