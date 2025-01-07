public class FaultyKeyboard2810 {

    public static void main(String[] args) {

    }

    public String finalString(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') builder.append(s.charAt(i));
            else builder.reverse();
        }

        return builder.toString();
    }
}
