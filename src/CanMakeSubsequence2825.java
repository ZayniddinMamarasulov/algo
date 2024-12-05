public class CanMakeSubsequence2825 {

    public static void main(String[] args) {
//        System.out.println(canMakeSubsequence("abc", "ad"));
//        System.out.println(canMakeSubsequence("zc", "ad"));
//        System.out.println(canMakeSubsequence("ab", "d"));
//        System.out.println(canMakeSubsequence("d", "e"));
//        System.out.println(canMakeSubsequence("abc", "abc"));
        System.out.println(canMakeSubsequence("dm", "e"));

//        char c = 'z';
//        c += 1;
//        System.out.println(c);
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        int index = 0;

        for (int i = 0; i < str1.length(); i++) {
            char nextChar = str1.charAt(i);
            if (nextChar == 'z')
                nextChar = 'a';
            else
                nextChar += 1;

            if (index == str2.length())
                break;

            if (str1.charAt(i) == str2.charAt(index) || nextChar == str2.charAt(index)) {
                if (index <= str2.length() - 1) {
                    index++;
                }
            }
        }

        return index == str2.length();
    }

}
