package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }

}
