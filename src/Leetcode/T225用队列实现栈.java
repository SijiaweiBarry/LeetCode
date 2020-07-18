package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/26 18:47
 */
public class T225用队列实现栈 {
    LinkedList<Integer> queue1 ;
    LinkedList<Integer> queue2 ;

    public T225用队列实现栈() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue1.isEmpty()){
            queue2.offer(x);
        }else if (queue2.isEmpty()){
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queue1.isEmpty()){
            while (queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }

            while (queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            return queue1.poll();

    }

    /** Get the top element. */
    public int top() {
        int t = 0;
        if (queue1.isEmpty()){
            while (queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            t = queue2.poll();
            queue1.offer(t);
        }
        if (queue2.isEmpty()){
            while (queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            t = queue1.poll();
            queue2.offer(t);
        }
        return t;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

