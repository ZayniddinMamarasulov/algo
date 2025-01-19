public class ValidPalindrome125 {

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        String REGEX = "^[a-zA-Z0-9]*$"; // is alphanumberic;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) + "").matches(REGEX))
                builder.append(s.charAt(i));
        }

        int left = 0;
        int right = builder.length() - 1;

        while (left < right) {
            if (!(builder.charAt(left) + "").equalsIgnoreCase((builder.charAt(right) + "")))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
