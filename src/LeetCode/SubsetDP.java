package LeetCode;

/**
 * Created by deepaksharma on 12/20/17.
 */
public class SubsetDP {

    public static boolean subsetSum(int input[], int total) {

        boolean[][] k = new boolean[input.length+1][total+1];

        for(int i = 0; i <= input.length; i++){
            k[i][0] = true;
        }

        for(int i = 1; i <= input.length; i++){
            for (int j = 1; j <= total; j++){
                if(j - input[i-1] >= 0){
                    k[i][j] = k[i-1][j] || k[i-1][j-input[i - 1]];
                }
                else{
                    k[i][j] = k[i-1][j];
                }
            }
        }
        return k[input.length][total];
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 5, 2, 1, 1, 6};

        int arr1[] = {2, 3, 7, 8};
        System.out.print(subsetSum(arr1, 11));

    }
}
