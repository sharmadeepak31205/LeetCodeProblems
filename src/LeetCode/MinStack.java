package LeetCode;

import java.util.Stack;

/**
 * Created by deepaksharma on 12/15/17.
 */
class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> s;
    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<>();
    }

    public void push(int x) {
        if(x <= min){
            s.push(min);
            min = x;
        }
        s.add(x);
    }

    public void pop() {
        if(min == s.pop()){
            min = s.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }
}
