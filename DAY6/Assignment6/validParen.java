// package Assignment6;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParen {
        public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {

            // If current character is a closing bracket
            if (closeToOpen.containsKey(c)) {

                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }

            } else {
                // Opening bracket
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([{}])";

        System.out.println(s1 + " -> " + isValid(s1));
        System.out.println(s2 + " -> " + isValid(s2));
        System.out.println(s3 + " -> " + isValid(s3));
        System.out.println(s4 + " -> " + isValid(s4));
    }
}
