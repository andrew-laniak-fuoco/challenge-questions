package ca.jrvs.challenge.string;

import java.util.Stack;

public class ValidateParentheses {

    /**
     * Write an algorithm that checks for correct
     * parentheses format using a Stack
     */
    public static boolean solution(String s) {
        Stack<Boolean> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(true);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // if we find a ')' before a '(' we fail
                }
                stack.pop();
            }

        }

        if (stack.isEmpty()) {
            return true; // if stack is empty, all '(' are matched
        }
        return false; // if stack has some element in it, we fail
    }
}
