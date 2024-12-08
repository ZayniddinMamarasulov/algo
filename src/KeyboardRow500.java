import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow500 {

    public static void main(String[] args) {
//        findWords(new String[]{"Alaska"});
        findWords(new String[]{"abdfs", "cccd", "a", "qwwewm"});
    }

    public static String[] findWords(String[] words) {
        String regexRow1 = "[qwertyuiop]*";
        String regexRow2 = "[asdfghjkl]*";
        String regexRow3 = "[zxcvbnm]*";
        List<String> answer = new ArrayList<>();

        for (String word : words)
            if (word.toLowerCase().matches(regexRow1)
                    || word.toLowerCase().matches(regexRow2)
                    || word.toLowerCase().matches(regexRow3)) {
                answer.add(word);
            }

        return answer.toArray(String[]::new);
    }
}
