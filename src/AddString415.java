public class AddString415 {

    public static void main(String[] args) {

    }

    public static String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();

        if (num1.length() > num2.length())
            num2 = leadZero(num2, num1.length() - num2.length());
        else
            num1 = leadZero(num1, num2.length() - num1.length());

        int care = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {
            int temp = (num1.charAt(i) - '0') + (num2.charAt(i) - '0') + care;
            care = temp / 10;
            builder.append(temp % 10);
        }

        if (care > 0) builder.append(care);

        return builder.reverse().toString();
    }

    public static String leadZero(String num, int len) {
        return "0".repeat(Math.max(0, len)) + num;
    }
}
