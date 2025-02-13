import java.util.ArrayDeque;
import java.util.Queue;

public class ReformatPhoneNumber1694 {


    public static void main(String[] args) {
//        reformatNumber("1-23-45 6");
//        reformatNumber("1-23-4");
        reformatNumber("123 4-5678");
    }

    public static String reformatNumber(String number) {
        char[] nums = number.toCharArray();
        Queue<Character> queue = new ArrayDeque<>();

        for (char num : nums) {
            if (num != ' ' && num != '-')
                queue.add(num);
        }

        StringBuilder builder = new StringBuilder();

        while (queue.size() > 4) {
            builder.append(queue.poll()).append(queue.poll()).append(queue.poll()).append('-');
        }

        if (queue.size() == 4)
            builder.append(queue.poll()).append(queue.poll())
                    .append('-')
                    .append(queue.poll()).append(queue.poll());

        while (!queue.isEmpty()) builder.append(queue.poll());

        return builder.toString();
    }
}
