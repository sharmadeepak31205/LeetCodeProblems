package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class PerfectSquares {

    //Dyanimc Programming And BFS is used

    public int numSquares(int n) {
        int sqrt = (int)Math.ceil(Math.sqrt(n));

        int[] T = new int[n+1];

        T[0] = 0;

        for(int i = 1; i < T.length; i++){
            T[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= sqrt; j++){
                if(i < j*j){
                    break;
                }
                T[i] = Math.min(T[i], T[i-j*j]+1);
            }
        }
        return T[n];
    }
}
