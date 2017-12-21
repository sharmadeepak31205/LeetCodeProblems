package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class KnapSack01 {

    public static int knapsackDP(int[] val, int[] wt, int W){
        int[][] k = new int[val.length + 1][W+1];

        for(int i = 0; i <= val.length; i++){
            for(int j = 0; j <= W; j++){
                if(i == 0 || j == 0){
                    k[i][j] = 0;
                    continue;
                }

                if(j - wt[i - 1] >= 0){
                    k[i][j] = Math.max(k[i-1][j], k[i-1][j-wt[i-1]] + val[i-1]);
                }
                else{
                    k[i][j] = k[i-1][j];
                }
            }
        }

        return k[val.length][W];
    }

    public static void main(String args[]){
        int val[] = {1,4,5,7};
        int wt[] = {1, 3, 4, 5};
        int r = knapsackDP(val, wt, 7);
        System.out.println(r);
    }
}
