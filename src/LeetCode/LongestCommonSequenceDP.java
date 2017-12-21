package LeetCode;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class LongestCommonSequenceDP {

    public static int lcs(char[] str1, char[] str2){

        int[][] k = new int[str1.length + 1][str2.length + 1];

        for(int i = 0; i < k.length; i++){
            for(int j = 0; j < k[i].length; j++){
                if(i == 0 || j == 0){
                    k[i][j] = 0;
                    continue;
                }

                if(str1[i-1] == str2[j-1]){
                    k[i][j] = k[i-1][j-1] + 1;
                }
                else{
                    k[i][j] = Math.max(k[i-1][j],k[i][j-1]);
                }
            }
        }

        return k[str1.length][str2.length];
    }

    public static void main(String args[]){
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";

        int result = lcs(str1.toCharArray(), str2.toCharArray());
        System.out.print(result);
    }
}
