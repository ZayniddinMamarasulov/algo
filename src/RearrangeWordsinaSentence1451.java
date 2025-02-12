import java.util.*;

public class RearrangeWordsinaSentence1451 {

    public static void main(String[] args) {
//        arrangeWords("  this   is  a sentence ");
        arrangeWords(" practice   makes   perfect");
    }

    public static String arrangeWords(String text) {

        StringBuilder[] builderArray = new StringBuilder[100];
        int k = 0;
        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 32) {
                if (!builder.isEmpty()) {
                    builderArray[k++] = builder;
                    builder = new StringBuilder();
                }
                count++;
            } else {
                builder.append(text.charAt(i));
            }
        }
        if (!builder.isEmpty()) builderArray[k++] = builder;

        StringBuilder resBuilder = new StringBuilder();

        int spaceLen = 0;
        int spaceRemain = 0;

        if (k != 1) {
            spaceLen = count / (k - 1);
            spaceRemain = count % (k - 1);
        } else {
            spaceRemain = count;
        }


        for (int i = 0; i < k; i++) {
            int space = spaceLen;
            resBuilder.append(builderArray[i]);

            if (i != k - 1)
                while (space > 0) {
                    resBuilder.append(" ");
                    space--;
                }
        }

        while (spaceRemain > 0) {
            resBuilder.append(" ");
            spaceRemain--;
        }

        return resBuilder.toString();
    }
}
