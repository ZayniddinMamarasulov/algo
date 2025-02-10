public class CounttheNumberofVowelStringsinRange2586 {

    public static void main(String[] args) {

    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            if ((words[i].startsWith("a")
                    | words[i].startsWith("u")
                    | words[i].startsWith("i")
                    | words[i].startsWith("o")
                    | words[i].startsWith("e"))
                    &&
                    (words[i].endsWith("a")
                            | words[i].endsWith("u")
                            | words[i].endsWith("i")
                            | words[i].endsWith("o")
                            | words[i].endsWith("e"))
            ) count++;
        }


        return count;
    }
}
