package LeetCode;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class NumberOfIslands {

    int n; int m;
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        n = grid.length;
        m = grid[0].length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    dfsMarking(grid, i, j);
                    ++count;
                }
            }
        }

        return count;
    }

    public void dfsMarking(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1' ){
            return;
        }

        grid[i][j] = '0';

        dfsMarking(grid, i+1, j);
        dfsMarking(grid, i-1, j);
        dfsMarking(grid, i, j+1);
        dfsMarking(grid, i, j-1);
    }
}
