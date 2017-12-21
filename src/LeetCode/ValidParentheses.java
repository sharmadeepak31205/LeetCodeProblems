package LeetCode;

import java.util.Stack;

/**
 * Created by deepaksharma on 11/20/17.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{'){
                stack.push('}');
            }
            else if(s.charAt(i) == '('){
                stack.push(')');
            }
            else if(s.charAt(i) == '['){
                stack.push(']');
            }
            else if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
                stack.pop();
            }
            else{
                return false;
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
