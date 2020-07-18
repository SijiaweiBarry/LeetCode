package Leetcode;

import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/18 11:21
 */
public class T20有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    continue;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    continue;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    continue;

                case '}':
                    if (  stack.isEmpty()||stack.pop() != '{') {
                        return false;
                    }
                    continue;

            }
        }
        return stack.isEmpty();
    }
}
