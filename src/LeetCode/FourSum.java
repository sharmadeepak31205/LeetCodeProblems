package LeetCode;

import java.util.HashMap;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class FourSum {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                int sum = A[i] + B[j];
                if(map.containsKey(sum)){
                    int value = map.get(sum);
                    map.put(sum,value+1);
                }
                else{
                    map.put(sum,1);
                }
            }
        }

        int res = 0;

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < D.length; j++){
                int sum = C[i] + D[j];
                if(map.containsKey(-1 * sum)){
                    res += map.get(-1*sum);
                }
            }
        }

        return res;
    }
}
