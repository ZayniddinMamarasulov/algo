import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.function.Function;

public class EvaluateReversePolishNotation150 {

    public static void main(String[] args) {
        evalRPN(new String[]{"4", "13", "5", "/", "+"});
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!Objects.equals(token, "+")
                    && !Objects.equals(token, "-")
                    && !Objects.equals(token, "*")
                    && !Objects.equals(token, "/")
            )
                stack.push(Integer.parseInt(token));
            else {
                switch (token) {
                    case "+" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a + b);
                    }
                    case "-" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a - b);
                    }
                    case "*" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a * b);
                    }
                    case "/" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a / b);
                    }
                }
            }
        }

        return stack.getFirst();
    }
}
