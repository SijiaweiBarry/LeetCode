package Leetcode;

import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/26 19:16
 */
public class T232用栈实现队列 {
    Stack<Integer>stack1 = new Stack<>();
    Stack<Integer>stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        int res = 0;
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        res =  stack2.peek();
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}
