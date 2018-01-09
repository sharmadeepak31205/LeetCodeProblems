package String;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class ValidPalindromeII {

    public static boolean validPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }

        int l = -1; int r = s.length();

        while (++l < --r){
            if(s.charAt(l) != s.charAt(r)){
                return checkPalindrome(s,l, r+1) || checkPalindrome(s,l-1,r);
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String s, int l, int r){
        while(++l < --r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        validPalindrome("abcdbcebdcba");
    }

}
