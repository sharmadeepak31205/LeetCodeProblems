package Array;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class WordSearchInTwoDMatrix {

    public boolean exist(char[][] board, String word) {

        char[] w = word.toCharArray();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(exist(board, i, j, w, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean exist(char[][] board, int i, int j, char[] word, int n){
        if(n == word.length){
            return true;
        }
        if(i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] != word[n]){
            return false;
        }

        board[i][j] ^= 256;

        boolean res = exist(board, i+1,j , word, n+1) || exist(board, i-1, j, word, n+1) || exist(board, i, j-1, word, n+1) || exist(board, i, j+1, word, n+1);

        board[i][j] ^= 256;
        return res;
    }
}
