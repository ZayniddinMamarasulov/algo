public class ReverseWords557 {

    public static void main(String[] args) {
        reverseWords("Let's take LeetCode contest");
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            res.append(reverse(words[i]));
            if (i != words.length - 1)
                res.append(" ");
        }


        return res.toString();
    }

    public static String reverse(String s) {
        char[] letters = s.toCharArray();

        int left = 0, right = letters.length - 1;

        while (left < right) {
            char temp = letters[right];
            letters[right] = letters[left];
            letters[left] = temp;
            right--;
            left++;
        }

        return String.valueOf(letters);
    }
}
