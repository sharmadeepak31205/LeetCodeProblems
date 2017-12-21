package LeetCode;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class MaxLengthOfRepeatedSubarray {

    public int findLength(int[] A, int[] B) {
        if(A == null && B == null){
            return 0;
        }

        if( A == null){
            return B.length;
        }

        if( B == null){
            return A.length;
        }

        int[][] k = new int[A.length+1][B.length+1];
        int max = 0;

        for(int i = 0; i <= A.length; i++){
            for(int j = 0; j <= B.length; j++){

                if(i == 0 || j == 0){
                    k[i][j] = 0;
                    continue;
                }
                else{
                    if(A[i-1] == B[j-1]){
                        k[i][j] = 1+k[i-1][j-1];
                        max = Math.max(max,k[i][j]);
                    }
                }

            }
        }

        return max;
    }
    
}
