import java.util.Arrays;

public class MinimumString2696 {

    public static void main(String[] args) {
//        minLength("ABFCACDB");
//        minLength("ACBBD");
        minLength("CCCCDDDD");
    }

    public static int minLength(String s) {

        StringBuilder builder = new StringBuilder(s);

        while (builder.toString().contains("AB") || builder.toString().contains("CD")) {
            if (builder.toString().contains("AB"))
                builder.replace(builder.toString().indexOf('A'), builder.toString().indexOf('B') + 1, "");
            if (builder.toString().contains("CD"))
                builder.replace(builder.toString().indexOf('C'), builder.toString().indexOf('D') + 1, "");
        }

        return builder.toString().length();
    }
}
