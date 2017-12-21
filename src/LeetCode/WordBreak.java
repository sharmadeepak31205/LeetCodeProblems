package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/14/17.
 */
public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] res = new boolean[s.length() + 1];

        res[0] = true;

        for(int i = 1; i < res.length; i++){
            for(int j = 0; j < i; j++){
                String sub = s.substring(j,i);
                if(res[j] && wordDict.contains(sub)){
                    res[i] = true;
                    break;
                }
            }
        }

        return res[s.length()];
    }

    public static void main(String[] args){
        String s = "leetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        wordBreak(s,list);
    }
}
