package String;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class LemgthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        s = s.trim();

        String[] arr = s.split(" ");

        if(arr.length == 0){
            return 0;
        }

        if(arr.length == 1){
            return arr[0].length();
        }

        return arr[arr.length - 1].length();

    }

    public static void main(String[] args){
        lengthOfLastWord("b   a    ");
    }

}
