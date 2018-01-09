package Array;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0){
            return false;
        }

        int m = matrix[0].length - 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(target > matrix[i][m]){
                    break;
                }

                if(matrix[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }

}
