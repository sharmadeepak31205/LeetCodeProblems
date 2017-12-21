package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class KthSmallestElementInMatrix {

    public static int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0){
            return 0;
        }

        int lo = matrix[0][0]; int hi = matrix[matrix.length -1][matrix.length-1]+1;

        while(lo < hi){
            int count = 0; int j = matrix[0].length-1;
            int mid = lo + (hi - lo)/2;

            for(int i = 0; i < matrix.length; i++){
                while(j >= 0 && matrix[i][j] > mid){
                    j--;
                }
                count += (j+1);
            }

            if(count < k) lo = mid+1;
            else{
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args){
        int[][] multi = new int[][]{
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        int result = kthSmallest(multi, 8);

        System.out.println(result);
    }
}
