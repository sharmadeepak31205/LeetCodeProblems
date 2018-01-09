package Array;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class PalindromicSubstring {

    static int count = 0;
    public static int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return count;
        }

        for(int i = 0; i < s.length(); i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }

        return count;
    }

    public static void extend(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }

    public static void main(String[] args){
        int res  = countSubstrings("babad");
    }

}
