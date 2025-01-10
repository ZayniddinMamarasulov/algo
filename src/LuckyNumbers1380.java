import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers1380 {

    public static void main(String[] args) {
//        luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});
//        luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}});
        luckyNumbers(new int[][]{{3, 6}, {7, 1}, {5, 2}, {4, 8}});
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int min = 0;
        int pos = 0;
        for (int[] ints : matrix) {
            int tempMin = ints[0];
            int tempPos = 0;
            for (int j = 0; j < matrix[0].length; j++)
                if (tempMin > ints[j]) {
                    tempMin = ints[j];
                    tempPos = j;
                }

            if (min < tempMin) {
                min = tempMin;
                pos = tempPos;
            }
        }

        List<Integer> last = new ArrayList<>();

        for (int[] ints : matrix)
            if (ints[pos] > min) return last;

        last.add(min);

        return last;
    }
}
