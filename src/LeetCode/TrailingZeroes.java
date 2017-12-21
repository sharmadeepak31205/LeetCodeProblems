package LeetCode;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n/5+trailingZeroes(n/5);
    }
}
