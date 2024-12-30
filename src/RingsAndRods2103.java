import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RingsAndRods2103 {

    public static void main(String[] args) {
        countPoints("B0B6G0R6R0R6G9");
    }

    public static int countPoints(String rings) {
        int res = 0;
        int[] red = new int[10],
                green = new int[10],
                blue = new int[10];

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (color == 'B') blue[rod]++;
            else if (color == 'R') red[rod]++;
            else if (color == 'G') green[rod]++;
        }

        for (int i = 0; i < 10; i++)
            if (red[i] > 0 && green[i] > 0 && blue[i] > 0)
                res++;


        return res;
    }

}
