import java.util.List;

public class CheckIfAString2828 {

    public boolean isAcronym(List<String> words, String s) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(i) != s.charAt(i)) return false;
        }

        return true;
    }
}
