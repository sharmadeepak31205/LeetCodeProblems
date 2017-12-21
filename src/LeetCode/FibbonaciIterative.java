package LeetCode;

/**
 * Created by deepaksharma on 12/8/17.
 */
public class FibbonaciIterative {

    public static int fibb(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        int one = 1;
        int two = 2;

        int ways = 0;

        for(int i = 2; i < n; i++){
            ways = one + two;
            one = two;
            two = ways;
        }

        return ways;
    }
}
