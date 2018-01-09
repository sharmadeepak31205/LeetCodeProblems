package Array;

/**
 * Created by deepaksharma on 12/26/17.
 */
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {

        int start = 0; int end = n*n;

        int[][] temp = new int[n][n];

        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = n-1;
        int colEnd = n-1;

        int count = 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin ; i <= colEnd; i++){
                temp[rowBegin][i] = count++;
            }
            rowBegin++;

            for(int i = rowBegin; i <= rowEnd; i++){
                temp[i][colEnd] = count++;
            }
            colEnd--;

            if(rowBegin <= rowEnd){
                for(int i = colEnd; i>= colBegin; i--){
                    temp[rowEnd][i] = count++;
                }
            }
            rowEnd--;

            if(colBegin <= colEnd){
                for(int i = rowEnd; i>= rowBegin; i--){
                    temp[i][colBegin] = count++;
                }
            }
            colBegin++;
        }

        return temp;
    }
}
