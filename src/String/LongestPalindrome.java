package String;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class LongestPalindrome {


    private int max = 0;
    private  int lo = 0;

    public String longestPalindrome(String s) {

        if(s == null || s.length() == 0){
            return null;
        }

        for(int i = 0; i < s.length(); i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }

        return s.substring(lo, lo+max);
    }

    public void extend(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        if(max < right - left - 1){
            lo = left+1;
            max = right-left-1;
        }
    }

    public static void main(String[] args){
        LongestPalindrome l = new LongestPalindrome();
        String res  = l.longestPalindrome("babad");
    }
}
