import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusOne {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
//        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int lastElement = digits[digits.length - 1];
        int[] newArray = new int[digits.length + 1];

        System.arraycopy(digits, 0, newArray, 0, digits.length);

        if (lastElement == 9)
            if (digits[0] == 9) {
                newArray[0] = 1;
                for (int i = 1; i < newArray.length; i++) {
                    newArray[i] = 0;
                }
                return newArray;
            } else {
                digits[0]++;
                for (int i = 1; i < digits.length; i++) {
                    digits[i] = 0;
                }
                return digits;
            }

        digits[digits.length - 1]++;
        return digits;
    }


}
