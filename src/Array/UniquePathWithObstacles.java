package Array;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class UniquePathWithObstacles {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if(obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }

        int m = obstacleGrid[0].length;

        int[] temp = new int[m];

        temp[0] = 1;

        for(int[] row : obstacleGrid){
            for(int i = 0; i < m; i++){
                if(row[i] == 1){
                    temp[i] = 0;
                }
                else if(i > 0){
                    temp[i] += temp[i-1];
                }
            }
        }

        return temp[m-1];
    }
}
