import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter2942 {

    public static void main(String[] args) {

    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
            if (words[i].contains(x + "")) res.add(i);

        return res;
    }
}
