import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleSecond119 {

    public static void main(String[] args) {
//        getRow(0);
//        getRow(1);
//        getRow(3);
        getRow(4);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));
//        triangle.add(List.of(1, 1));

        if (rowIndex == 0) return triangle.getFirst();
//        if(rowIndex == 1) return triangle.get(1);

        for (int i = 2; i <= rowIndex; i++) {
            triangle.add(generateNThRow(triangle, i));
        }

        triangle.add(generateNThRow(triangle, rowIndex + 1));

        return triangle.get(rowIndex);
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
