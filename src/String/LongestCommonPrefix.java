package String;

import java.util.Arrays;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        int len = strs[0].length() < strs[strs.length - 1].length() ? strs[0].length() : strs[strs.length - 1].length();

        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int count = 0;

        for(int i = 0; i < len; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                break;
            }
            sb.append(s1.charAt(i));
        }

        return sb.toString();
    }

}
