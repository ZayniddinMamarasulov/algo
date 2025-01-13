public class ShortestDistance821 {

    public static void main(String[] args) {
        System.out.println(shortestToChar("loveleetcode", 'e'));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] array = new int[s.length()];
        char[] input = s.toCharArray();
        int count = 0;

        for (char value : input) if (value == c) count++;

        int[] indexes = new int[count];

        int k = 0;
        for (int i = 0; i < input.length; i++)
            if (input[i] == c) indexes[k++] = i;

        for (int i = 0; i < input.length; i++)
            if (input[i] != c)
                array[i] = minDist(indexes, i);

        return array;
    }

    public static int minDist(int[] array, int cur) {
        int min = Math.abs(cur - array[0]);

        for (int j : array)
            if (Math.abs(cur - j) < min) min = Math.abs(cur - j);

        return min;
    }
}
