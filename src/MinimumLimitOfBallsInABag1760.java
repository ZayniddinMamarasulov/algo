public class MinimumLimitOfBallsInABag1760 {

    public static void main(String[] args) {
        System.out.println(minimumSize(new int[]{9}, 2));
        System.out.println(minimumSize(new int[]{7, 17}, 2));
        System.out.println(minimumSize(new int[]{2, 4, 8, 2}, 4));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int l = 1, r = 0;
        for (int num : nums) r = Math.max(r, num);
        int answer = r;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (isPossible(mid, nums, maxOperations)) {
                answer = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }

        return answer;
    }

    public static boolean isPossible(int maxBalls, int[] nums, int maxOper) {
        int totalOperations = 0;

        for (int num : nums) {
            int operations = (int) Math.ceil((double) num / maxBalls) - 1;
            totalOperations += operations;
            if (totalOperations > maxOper) return false;
        }

        return true;
    }
}
