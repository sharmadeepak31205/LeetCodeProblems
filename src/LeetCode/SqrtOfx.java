package LeetCode;

/**
 * Created by deepaksharma on 12/8/17.
 */
public class SqrtOfx {

    public static int mySqrt(int x) {
        if(x == 0){
            return 0;
        }

        if(x == 1){
            return 1;
        }

        for(long i = 0; i < x; i++){
            long j = i*i;
            long k = (i+1) * (i+1);

            if(x >= j && k > x) {
                return (int)i;
            }
        }

        return 0;
    }

    public static void main(String[] args){
        int result = mySqrt(42);
        System.out.print(result);
    }
}
