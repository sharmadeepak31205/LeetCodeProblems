package LeetCode;

/**
 * Created by deepaksharma on 12/5/17.
 */
public class Implement_strStr {

    public static int strStr(String haystack, String needle) {

        for(int i = 0; ; i++){
            for(int j = 0; ; j++){
                if(j == needle.length())
                    return i;

                if(i+j == haystack.length())
                    return -1;

                if(haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
        }

    }

    public static void main(String[] args){
        String s1 = "aall";
        String s2 = "ll";

        int result = strStr(s1,s2);
        System.out.print(result);
    }
}
