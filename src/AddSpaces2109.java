import java.util.ArrayList;
import java.util.List;

public class AddSpaces2109 {

    public static void main(String[] args) {

        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuffer buffer = new StringBuffer();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == spaces[k]) {
                buffer.append(" ");
                if (k != spaces.length - 1)
                    ++k;
            }
            buffer.append(s.charAt(i));
        }

        return buffer.toString();
    }
}
