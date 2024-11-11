import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
//        System.out.println(generate(3));
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            triangle.add(generateNThRow(triangle, i+1));
        }

        return triangle;
    }

    public static List<Integer> generateNThRow(List<List<Integer>> triangle, int n) {
        List<Integer> row = new ArrayList<>(n);

        if (n == 1)
            row.add(1);
        else if (n == 2) {
            row.add(1);
            row.add(1);
        } else
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    row.add(1);
                    continue;
                }
                row.add(triangle.get(n - 2).get(i - 1) + triangle.get(n - 2).get(i));
            }


        return row;
    }
}
