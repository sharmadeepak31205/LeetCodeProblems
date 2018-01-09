package Array;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class DeleteOperationForTwoString {

    /*Lowest Common Sunsequence*/

    public static int minDistance(String word1, String word2) {
        int[][] arr = new int[word1.length()+1][word2.length()+1];

        for(int i = 0; i <= word1.length(); i++){
            for(int j = 0; j <= word2.length(); j++){
                if(i == 0 || j == 0){
                    arr[i][j] = 0;
                }
                else{
                    if(word1.charAt(i-1) == word2.charAt(j-1)){
                        arr[i][j] = arr[i-1][j-1] + 1;
                    }
                    else{
                        arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                    }
                }

            }
        }

        int val = arr[word1.length()][word2.length()];

        return word1.length() - val + word2.length() - val;
    }

    public static void main(String[] args){
        String s1 = "sea"; String s2 = "eat";
        minDistance(s1,s2);

    }
}
