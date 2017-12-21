package LeetCode;

/**
 * Created by deepaksharma on 12/18/17.
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0){
            return false;
        }

        int i = matrix.length; int j = matrix[0].length; int m = 0; int n = j-1;

        while(m < i && n >= 0){
            if(matrix[m][n] == target){
                return true;
            }

            else if(matrix[m][n] < target){
                m++;
            }
            else{
                n--;
            }
        }
        return false;
    }

}
