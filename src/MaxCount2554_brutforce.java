public class MaxCount2554_brutforce {

    public static void main(String[] args) {
//        System.out.println("res = " + maxCount(new int[]{1, 6, 5,}, 5, 6));
//        System.out.println("res = " + maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, 1));
        System.out.println("res = " + maxCount(new int[]{11}, 7, 50));
//        System.out.println("res = " + maxCount(new int[]{29}, 3, 6));
    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!isContains(banned, i) && sum < maxSum) {
                System.out.println(i);
                sum += i;
                if (sum <= maxSum) count++;
            }
        }

        return count;
    }

    public static boolean isContains(int[] banned, int x) {
        for (int j : banned) {
            if (j == x)
                return true;
        }
        return false;
    }
}
