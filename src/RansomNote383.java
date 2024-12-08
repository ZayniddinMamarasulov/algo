import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++)
            arr[magazine.charAt(i) - 'a']++;

        for (int i = 0; i < ransomNote.length(); i++) {
            int offs = ransomNote.charAt(i) - 'a';

            if (arr[offs] > 0)
                arr[offs]--;
            else
                return false;
        }

        return true;
    }
}
