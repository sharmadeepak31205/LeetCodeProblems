package Array;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {

        if(grid == null || grid.length == 0){
            return 0;
        }
        int sum = 0;

        int m = grid.length; int n = grid[0].length;

        int[][] temp = new int[m][n];

        for(int i = 0; i < m; i++){
            temp[i][0] = sum + grid[i][0];
            sum = temp[i][0];
        }

        sum = 0;

        for(int i = 0; i < n; i++){
            temp[0][i] =  sum + grid[0][i];
            sum = temp[0][i];
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){

                temp[i][j] = grid[i][j] + Math.min(temp[i-1][j], temp[i][j-1]);
            }
        }

        return temp[m-1][n-1];

    }

    public static void main(String[] args){
        MinimumPathSum m = new MinimumPathSum();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int res = m.minPathSum(grid);
        System.out.print(res);
    }
}
