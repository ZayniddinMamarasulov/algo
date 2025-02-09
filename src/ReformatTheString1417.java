import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReformatTheString1417 {

    public static void main(String[] args) {
        reformat("a0b1c2");
    }

    public static String reformat(String s) {
        if (s.length() == 1) return s;
        Queue letters = new ArrayDeque();
        Queue digits = new ArrayDeque();

        char[] sChar = s.toCharArray();

        for (char c : sChar) {
            if (c >= '0' && c <= '9') digits.add(c);
            else letters.add(c);
        }

        if (digits.isEmpty() || letters.isEmpty()) return "";
        if (Math.abs(digits.size() - letters.size()) >= 2) return "";

        StringBuilder builder = new StringBuilder();

        while (!digits.isEmpty() || !letters.isEmpty()) {
            if (digits.size() > letters.size()) {
                if (!digits.isEmpty())
                    builder.append(digits.poll());
                if (!letters.isEmpty())
                    builder.append(letters.poll());
            } else {
                if (!letters.isEmpty())
                    builder.append(letters.poll());
                if (!digits.isEmpty())
                    builder.append(digits.poll());
            }
        }

        return builder.toString();
    }
}
