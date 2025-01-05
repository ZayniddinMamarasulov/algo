public class ToLowerCase709 {

    public static void main(String[] args) {
        toLowerCase("Hello");
    }

    public static String toLowerCase(String s) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 65 && cur <= 90)
                buffer.append((char) (cur + 32));
            else
                buffer.append(cur);
        }

        return buffer.toString();
    }
}
