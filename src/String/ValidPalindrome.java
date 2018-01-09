package String;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {


        if(s == null || s.length() == 0){
            return true;
        }

        s = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();

        for(int i = 0 , j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
