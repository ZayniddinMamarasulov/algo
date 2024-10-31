public class FindTheIndexOfFirstOccurance {
    public static void main(String[] args) {
        System.out.println(strStr("kksadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.substring(i, needle.length() + i).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}
