public class DetectCapitalUse {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("usa"));
    }

    public static boolean detectCapitalUse(String word) {
        boolean startsWithCapital = isCapital(word.charAt(0));
        if (word.length() > 1)
            if (startsWithCapital) {
                boolean secondCapital = isCapital(word.charAt(1));

                for (int i = 2; i < word.length(); i++) {
                    if (secondCapital) {
                        if (!isCapital(word.charAt(i))) return false;
                    } else {
                        if (isCapital(word.charAt(i))) return false;
                    }
                }
            } else {
                for (int i = 1; i < word.length(); i++) {
                    if (isCapital(word.charAt(i))) return false;
                }
            }

        return true;
    }

    public static boolean isCapital(char a) {
        return a >= 65 && a <= 90;
    }

}
