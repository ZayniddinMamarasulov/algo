import java.util.HashSet;
import java.util.Set;

public class MaxCount2554 {

    public static void main(String[] args) {
//        System.out.println("res = " + maxCount(new int[]{1, 6, 5,}, 5, 6));
//        System.out.println("res = " + maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, 1));
        System.out.println("res = " + maxCount(new int[]{11}, 7, 50));
//        System.out.println("res = " + maxCount(new int[]{29}, 3, 6));
    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;

        Set<Integer> bannedSet = new HashSet<>();
        for (int j : banned) bannedSet.add(j);

        for (int i = 1; i <= n; i++) {
            if (bannedSet.contains(i)) continue;

            if (maxSum - i < 0) return count;
            maxSum -= i;
            count++;
        }

        return count;
    }
}
