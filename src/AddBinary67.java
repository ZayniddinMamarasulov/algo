public class AddBinary67 {

    public static void main(String[] args) {
//        addBinary("10", "1");
        addBinary("11", "1");
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int digitA = i > a.length() - 1 ? 0 : (a.charAt(i) - '0');
            int digitB = i > b.length() - 1 ? 0 : (b.charAt(i) - '0');

            int total = digitA + digitB + carry;
            String c = (total % 2) + "";
            res.insert(0, c);
            carry = total / 2;
        }

        if (carry != 0) res.insert(0, "1");

        System.out.println(res);
        return res.toString();
    }
}
