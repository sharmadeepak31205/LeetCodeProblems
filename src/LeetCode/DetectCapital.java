package LeetCode;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
        if(word == null || word.length() <= 1){
            return true;
        }

        int count = 0;
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if('Z' - arr[i] >= 0){
                count++;
            }
        }

        return ((count == 0 || count == word.length()) || (count == 1 && 'Z' - arr[0] > 0));
    }

    public static void main(String[] args){
        detectCapitalUse("USA");
    }
}
