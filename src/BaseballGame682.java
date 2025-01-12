import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {

    public static void main(String[] args) {
        calPoints(new String[]{"5", "2", "C", "D", "+"});
    }

    public static int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int i = 0;

        for (String a : operations) {
            switch (a) {
                case "C":
                    i--;
                    break;
                case "D":
                    scores[i] = scores[i - 1] * 2;
                    i++;
                    break;
                case "+":
                    scores[i] = scores[i - 1] + scores[i - 2];
                    i++;
                    break;
                default:
                    scores[i] = Integer.parseInt(a);
                    i++;
                    break;
            }
        }

        int sum = 0;
        for (int j = 0; j < i; j++) sum += scores[j];

        return sum;
    }
}
