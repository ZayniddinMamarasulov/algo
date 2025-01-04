import java.util.HashSet;

public class FirstLetter2351 {

    public static void main(String[] args) {

    }

    public char repeatedCharacter(String s) {
        HashSet hashSet = new HashSet();

        for (char c : s.toCharArray())
            if (!hashSet.contains(c)) hashSet.add(c);
            else return c;

        return 'a';
    }
}
