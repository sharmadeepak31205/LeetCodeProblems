package LeetCode;
import java.util.*;
/**
 * Created by deepaksharma on 12/15/17.
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        if(tokens == null || tokens.length == 0){
            return 0;
        }

        Stack<Integer> s = new Stack<>();

        for(String str : tokens){
            if(str.equals("+")){
                s.add(s.pop() + s.pop());
            }
            else if(str.equals("/")){
                int b = s.pop();
                int a = s.pop();
                s.add(a/b);
            }
            else if(str.equals("*")){
                s.add(s.pop() * s.pop());
            }
            else if(str.equals("-")){
                int b = s.pop();
                int a = s.pop();
                s.add(a - b);
            }
            else{
                s.add(Integer.parseInt(str));
            }
        }

        return s.pop();
    }
}
