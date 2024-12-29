public class PercentageOfLetter2278 {

    public static void main(String[] args) {
        percentageLetter("foobar", 'o');
    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == letter) count++;

        return (int) (((double) count / s.length()) * 100);
    }
}
