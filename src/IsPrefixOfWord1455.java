public class IsPrefixOfWord1455 {

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(isPrefixOfWord("i am tired", "you"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord))
                return i + 1;
        }

        return -1;
    }
}
