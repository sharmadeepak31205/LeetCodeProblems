package String;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class LongestUncommonSubsequenceII {

    public static int findLUSlength(String[] strs) {


        Set<String> set = new TreeSet<>();

        for(String str : strs){
            set.add(str);


        }
     return 0;
    }

    public static void main(String[] args){
        String[] str = {"a","ab","abc", "bcdeas", "cdsfaghf", "bcdea"};
        findLUSlength(str);
    }
}
