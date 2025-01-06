public class FindUniqueBinaryString1980 {

    public static void main(String[] args) {
//        findDifferentBinaryString(new String[]{"01", "10"});
//        findDifferentBinaryString(new String[]{"111", "011", "001"});
        findDifferentBinaryString(new String[]{"11010011101", "10110010101", "01011001111", "01100011001", "00110110110", "10110011011", "11110000010", "01110000000", "00110011100", "11111011100", "11111110110"});
//        findDifferentBinaryString(new String[]{"00", "01"});
    }

    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder builder = new StringBuilder();
        builder.append("1".repeat(nums[0].length()));

        int[] all = new int[convertBinaryToDecimal(builder.toString()) + 1];

        for (String num : nums) all[convertBinaryToDecimal(num)]++;

        for (int i = 0; i < all.length; i++) {
            if (all[i] == 0) {
                StringBuilder resBuilder = new StringBuilder();
                resBuilder.append(Integer.toBinaryString(i));

                while (resBuilder.length() < nums[0].length())
                    resBuilder.insert(0, '0');

                return resBuilder.toString();
            }
        }

        return "";
    }

    public static int convertBinaryToDecimal(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int value = Character.getNumericValue(str.charAt(i));
            result = result * 2 + value;
        }
        return result;
    }
}
