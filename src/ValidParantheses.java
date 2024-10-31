import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {

    }

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char i : input.toCharArray()) {
            switch (i) {
                case '(', '[', '{' -> stack.push(i);
                case ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    else stack.pop();
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    else stack.pop();
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    else stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}