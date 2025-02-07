public class MaximumNumberofBalloons1189 {

    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {
        int count = 0;
        char[] input = text.toCharArray();
        int[] inputArray = new int[26];

        for (char c : input) inputArray[c - 'a']++;

        while (true) {
            if (inputArray[1] > 0
                    && inputArray[0] > 0
                    && inputArray[11] > 1
                    && inputArray[14] > 1
                    && inputArray[13] > 0) {
                count++;

                inputArray[1]--;
                inputArray[0]--;
                inputArray[11] -= 2;
                inputArray[14] -= 2;
                inputArray[13]--;
            } else break;
        }

        return count;
    }
}
