public class SlowestKey1629 {

    public static void main(String[] args) {
//        slowestKey(new int[]{28, 65, 97}, "gaf");
        slowestKey(new int[]{9, 29, 49, 50}, "cbcd");
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int slowest = releaseTimes[0];
        int keyIndex = 0;

        for (int i = 1; i < releaseTimes.length; i++) {
            int cur = releaseTimes[i] - releaseTimes[i - 1];
            if (cur > slowest) {
                slowest = cur;
                keyIndex = i;
            } else if (cur == slowest) {
                int temp = Math.max(keysPressed.charAt(keyIndex), keysPressed.charAt(i));
                keyIndex = keysPressed.indexOf(temp);
            }
        }

        return keysPressed.charAt(keyIndex);
    }
}
