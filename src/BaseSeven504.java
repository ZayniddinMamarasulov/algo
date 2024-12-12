public class BaseSeven504 {

    public static void main(String[] args) {

    }

    public static String convertToBase7(int num) {
        StringBuffer res = new StringBuffer();

        String sign = num > 0 ? "" : "-";
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 7;
            num /= 7;

            res.append(digit);
        }

        if(res.isEmpty()) return "0";

        return sign + res.reverse();
    }
}
