package LeetCode;

import java.util.HashSet;
import java.util.stream.Collector;

/**
 * Created by deepaksharma on 11/29/17.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstring(String s){
        if(s == null || s.length() == 0){
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, maxSoFar = 0;


        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                maxSoFar = Math.max(maxSoFar, set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        int result = longestSubstring(s);
        System.out.print(result);
    }
}
