package Array;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class MaxSwap {

    public int maximumSwap(int num) {

        if(num == 0){
            return 0;
        }

        char[] arr = String.valueOf(num).toCharArray();
        int[] bucket = new int[10];

        for(int i = 0; i < arr.length; i++){
            bucket[arr[i] - '0'] = i;
        }

        for(int i = 0; i < arr.length; i++){
            for(int k = 9; k > arr[i] - '0'; k--){
                if(bucket[k] > i){
                    char temp = arr[bucket[k]];
                    arr[bucket[k]] = arr[i];
                    arr[i] = temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
    }
}
