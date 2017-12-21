package LeetCode;

/**
 * Created by deepaksharma on 12/3/17.
 */
public class ReverseInteger {

    public static int reverse(int x) {

        int res = 0;

        while(x != 0){
            int temp = x % 10;
            int tempRes = res;
            res = res * 10 + temp;

            if((res - temp)/10 != tempRes){
                return 0;
            }
            x = x/10;
        }

        return res;
    }

    public static void main(String[] args){
        int x = 123;
        int result = reverse(x);
        System.out.print(result);
    }
}
