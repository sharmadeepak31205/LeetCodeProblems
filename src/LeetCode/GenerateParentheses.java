package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/4/17.
 */
public class GenerateParentheses {

    public List<String> generateParentheses(int n){
        List<String> list = new ArrayList<>();

        generate(list, n, "", 0,0);
        return list;
    }

    public void generate(List<String> list, int n, String s, int open, int close){
        if(s.length() == n*2){
            list.add(s);
            return;
        }

        if(open < n){
            generate(list, n, s + '(', open + 1, close);
        }

        if(close < open){
            generate(list, n, s + ')', open, close + 1);
        }
    }
}
