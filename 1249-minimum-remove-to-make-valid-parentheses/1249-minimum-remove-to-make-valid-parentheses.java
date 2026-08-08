import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        // Find invalid parentheses
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(i);
            }
            else if (ch == ')') {

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // Mark unmatched ')'
                    str.setCharAt(i, '*');
                }
            }
        }

        // Remaining '(' are unmatched
        while (!stack.isEmpty()) {
            str.setCharAt(stack.pop(), '*');
        }

        // Build final string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}