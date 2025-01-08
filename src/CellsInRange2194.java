import java.util.ArrayList;
import java.util.List;

public class CellsInRange2194 {

    public static void main(String[] args) {
        cellsInRange("K1:L2");
    }

    public static List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char startLetter = s.charAt(0);
        char endLetter = s.charAt(3);
        int startNumber = s.charAt(1) - '0';
        int endNumber = s.charAt(4) - '0';

        for (char i = startLetter; i <= endLetter; i++)
            for (int j = startNumber; j <= endNumber; j++)
                res.add((i) + "" + j);

        return res;
    }
}
