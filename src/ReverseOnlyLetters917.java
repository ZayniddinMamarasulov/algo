public class ReverseOnlyLetters917 {

    public static void main(String[] args) {
//        reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println(reverseOnlyLetters("7_28]"));
//        reverseOnlyLetters("Test1ng-Leet=code-Q!");
//        reverseOnlyLetters("ab-cd");
    }

    public static String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            boolean leftLetter = (c[left] >= 65 && c[left] <= 90) || (c[left] >= 97 && c[left] <= 122);
            boolean rightLetter = (c[right] >= 65 && c[right] <= 90) || (c[right] >= 97 && c[right] <= 122);

            if (!leftLetter) {
                left++;
                continue;
            }
            if (!rightLetter) {
                right--;
                continue;
            }

            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }

        return new String(c);
    }

}
