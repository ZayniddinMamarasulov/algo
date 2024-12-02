import java.util.ArrayList;
import java.util.List;

public class CheckIfExist1346 {

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10, 2, 5, 3}));
        System.out.println(checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
        System.out.println(checkIfExist(new int[]{0, 0}));
    }

    public static boolean checkIfExist(int[] arr) {
        List<Integer> doubled = new ArrayList<>();
        int numberOfZeros = 0;

        for (int k : arr)
            if (k == 0) numberOfZeros++;
            else if (k % 2 == 0) doubled.add(k / 2);

        if (numberOfZeros > 1) return true;
        if (doubled.isEmpty()) return false;

        for (int j : arr)
            if (doubled.contains(j))
                return true;

        return false;
    }
}
