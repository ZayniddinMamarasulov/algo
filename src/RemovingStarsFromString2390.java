import java.util.Stack;

public class RemovingStarsFromString2390 {

    public static void main(String[] args) {

    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char letter : s.toCharArray())
            if (letter == '*')
                stack.pop();
            else
                stack.push(letter);

        StringBuffer buffer = new StringBuffer();
        stack.stream().forEach(t -> {
            buffer.append(t);
        });

        return buffer.toString();
    }
}
